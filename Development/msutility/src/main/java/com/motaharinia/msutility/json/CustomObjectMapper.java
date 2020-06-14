/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.motaharinia.msutility.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.motaharinia.msutility.json.serializer.*;
import ir.mbazar.utility.presentation.customdatetime.CustomDate;
import ir.mbazar.utility.presentation.customdatetime.CustomDateTime;
import ir.mbazar.utility.presentation.json.deserializer.JsonDeserializerString;
import ir.mbazar.utility.presentation.json.serializer.*;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 *
 * @author Administrator
 */
@Component
public class CustomObjectMapper extends ObjectMapper {

    public CustomObjectMapper(MessageSource messageSource) {
        DefaultSerializerProvider.Impl sp = new DefaultSerializerProvider.Impl();
        sp.setNullValueSerializer(new JsonSerializerNullValue());
//        sp.setNullKeySerializer(new JsonSerializerNullKey());
        this.setSerializerProvider(sp);

        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addSerializer(String.class, new JsonSerializerString(messageSource));
        simpleModule.addSerializer(Date.class, new JsonSerializerDate());
        simpleModule.addSerializer(CustomDate.class, new JsonSerializerCustomDate());
        simpleModule.addSerializer(CustomDateTime.class, new JsonSerializerCustomDateTime());
        simpleModule.addDeserializer(String.class, new JsonDeserializerString());
      
        
//        simpleModule.addKeyDeserializer(Double.class, new JsonDeserializeKeyNonString());
//        simpleModule.addKeyDeserializer(String.class, new JsonDeserializeKeyString());
//        simpleModule.addDeserializer(Double.class, new JsonDeserializerDouble());

//        module.addDeserializer(Integer.class, new JsonIntegerDeserializer());
        this.registerModule(simpleModule);
    }

    public CustomObjectMapper() {
    }
}
