/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.motaharinia.msutility.json.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import ir.mbazar.utility.presentation.string.StringTools;

import java.io.IOException;

/**
 *
 * @author administrator
 */
public class JsonDeserializerString extends JsonDeserializer<String> {

    @Override
    public String deserialize(JsonParser jp, DeserializationContext dc) throws IOException, JsonProcessingException {

        if (jp.getCurrentName() != null) {
            if (jp.getCurrentName().toLowerCase().equals("htmlCustomString".toLowerCase())) {
                return jp.getText();
            }
        }
        return StringTools.removeHtml(jp.getText());
    }
//    
//   @Override
//    public JsonDeserializer<?> createContextual(DeserializationConfig cfg,BeanProperty property) throws JsonMappingException {
//
//        Class<?> targetClass = property.getType().containedType(1).getRawClass();
//
////        if(targetClass.equals(Car.class) { 
////            return carDeserializer; // Type mismatch!
////        } else if (targetClass.equals(Bike.class)) {
////            return bikeDeserializer; // Type mismatch!
////        } else {
////            return this;
////        }
//        return null;
//    }

}
