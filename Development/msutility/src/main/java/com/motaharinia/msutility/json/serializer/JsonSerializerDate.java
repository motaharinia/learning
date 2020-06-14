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
import com.motaharinia.msutility.calendar.CalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.i18n.LocaleContextHolder;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author myuser
 */
public class JsonSerializerDate extends JsonSerializer<Date> {

    private static final Logger logger = LoggerFactory.getLogger(JsonSerializerDate.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

    @Override
    public void serialize(Date date, JsonGenerator jsonGen, SerializerProvider sp) throws IOException, JsonProcessingException {
        jsonGen.writeString(fixDate(date));
    }

    public String fixDate(Date date) {
        logger.info("injaaaaaaaaa");
        String formattedDate = dateFormat.format(date);
        logger.info("formattedDate: " + formattedDate);
        Locale locale = LocaleContextHolder.getLocale();
        if (locale.getLanguage().equals("fa")) {
            String convertedDate = "";
            try {
                convertedDate = CalDateTime.gregorianToJalaliDate(formattedDate, "-", "/");
            } catch (ParseException ex) {
                logger.info("GGGGGGGGGG ParseException : " + ex);
//                Logger.getLogger(GridData.class.getName()).log(Level.SEVERE, null, ex);
            }
            return convertedDate;
        } else {
            return formattedDate;
        }
    }
}
