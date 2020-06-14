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
import org.springframework.stereotype.Component;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import java.io.IOException;
import java.util.Locale;

/**
 *
 * @author Administrator
 */
@Component
public class JsonSerializerLang extends JsonSerializer<String> {

    private static final Logger logger = LoggerFactory.getLogger(JsonSerializerLang.class);
    

    @Override
    public void serialize(String langKey, JsonGenerator gen, SerializerProvider provider)
            throws IOException, JsonProcessingException {
        String langKeyTranslated = "";
        logger.info("\nSSSSSSSSSS Method Start: " + langKey);
        logger.info("----------------------------------------------");
        logger.info(langKey);
        logger.info("----------------------------------------------");
        WebApplicationContext webAppContext = ContextLoader.getCurrentWebApplicationContext();
        MessageSource messageSource = (MessageSource)webAppContext.getBean("messageSource");
        Locale locale = LocaleContextHolder.getLocale();
        langKeyTranslated = messageSource.getMessage(langKey, new Object[]{}, locale);
        logger.info("---res: " + langKeyTranslated);
        gen.writeString(langKeyTranslated);

    }

}
