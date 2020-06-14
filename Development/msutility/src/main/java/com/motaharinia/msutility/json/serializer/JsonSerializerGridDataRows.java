/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.motaharinia.msutility.json.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import ir.mbazar.utility.presentation.grid.griddata.GridRowModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author Administrator
 */
//@Component
public class JsonSerializerGridDataRows extends JsonSerializer<List<Object[]>> {

    private static final Logger logger = LoggerFactory.getLogger(JsonSerializerGridDataRows.class);
    @Autowired
    public MessageSource messageSource;

    @Override
    public void serialize(List<Object[]> rows, JsonGenerator gen, SerializerProvider provider)
            throws IOException, JsonProcessingException {

        if (rows.isEmpty()) {
            return;
        }
        Integer id = 0;
        Object[] row = null;
        GridRowModel gridRow = null;
        GridRowModel[] gridRowsArray = new GridRowModel[rows.size()];
        for (int i = 0; i < rows.size(); i++) {
            if (rows.get(i) != null) {
                row = rows.get(i);
                id = 0;
                if (row[0] != null) {
                    id = (Integer) row[0];
                }
                if (row != null) {
                    gridRow = new GridRowModel(id, row);
                    gridRowsArray[i] = gridRow;
                } else {
                    logger.info("NNNNNNNNNNNNNNNNNNNNNNN : cell is null");
                }
            }
        }
        for (int i = 0; i < gridRowsArray.length; i++) {
            logger.info(gridRowsArray[i].toString());
        }
        gen.writeObject(gridRowsArray);
    }

}
