package com.motaharinia.msutility.json.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.motaharinia.msutility.grid.GridRowModel;
import com.motaharinia.msutility.json.CustomObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class JsonDeserializerGridDataRows extends JsonDeserializer<List<Object[]>> {

    @Override
    public List<Object[]> deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        String gridRowModelArrayJson = jp.getText();

        List<Object[]> rows = new ArrayList<>();
        CustomObjectMapper customObjectMapper = new CustomObjectMapper(null);
        GridRowModel[] gridRowsArray = customObjectMapper.readValue(gridRowModelArrayJson, GridRowModel[].class);
        if (gridRowsArray != null) {
            for (GridRowModel gridRowModel : gridRowsArray) {
                rows.add(gridRowModel.getCell());
            }
        }
        return rows;
    }

}
