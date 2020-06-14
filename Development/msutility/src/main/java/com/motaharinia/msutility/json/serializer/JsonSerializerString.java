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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

import java.io.IOException;
import java.util.Locale;

/**
 *
 * @author Administrator
 */
public class JsonSerializerString extends JsonSerializer<String> {

    private static final Logger logger = LoggerFactory.getLogger(JsonSerializerString.class);

    public MessageSource messageSource;

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public JsonSerializerString(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Override
    public void serialize(String objString, JsonGenerator jsonGen, SerializerProvider provider) throws IOException, JsonProcessingException {
        String tmp = "";
        if (objString == null) {
            objString = "";
        } else {
            if (objString.length() > 7) {
                if ((messageSource != null) && ("etcItem.".equals(objString.substring(0, 8)))) {
                    tmp = "etcItem:" + objString;
                    Locale locale = LocaleContextHolder.getLocale();
                    objString = messageSource.getMessage(objString, new Object[]{}, locale);
                    logger.info("JsonStringSerializer: " + tmp + " Translated: " + objString);
                }
            }
        }
        jsonGen.writeString(objString);
    }

    public String fixNullValue(String value) {
        if (value == null) {
            return "";
        } else {
            return value;
        }
    }

}
