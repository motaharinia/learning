package com.motaharinia.msutility.json.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-12
 * Time: 01:05:58
 * Description: این کلاس برای تبدیل کلید نال به رشته جیسون خالی برای ارسال به سمت کلاینت میباشد
 */
public class JsonSerializerNullKey extends JsonSerializer<Object> {

    @Override
    public void serialize(Object obj, JsonGenerator jsonGen, SerializerProvider sp) throws IOException, JsonProcessingException {
        jsonGen.writeFieldName("");
    }
    
}
