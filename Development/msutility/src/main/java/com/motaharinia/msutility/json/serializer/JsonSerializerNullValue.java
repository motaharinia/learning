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

import java.io.IOException;

/**
 *
 * @author Administrator
 */
public class JsonSerializerNullValue extends JsonSerializer<Object> {

    @Override
    public void serialize(Object obj, JsonGenerator jsonGen, SerializerProvider sp) throws IOException, JsonProcessingException {
        jsonGen.writeString("");
    }
}
