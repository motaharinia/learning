package com.motaharinia.msutility.json.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.motaharinia.msutility.calendar.CalDateTime;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.util.ObjectUtils;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-17
 * Time: 12:09:17
 * Description:
 */
public class JsonSerializerClass  extends JsonSerializer<Object> {

    @Override
    public void serialize(Object object, JsonGenerator jsonGen, SerializerProvider sp) throws IOException {
        System.out.println("object:" + object);
        if(!ObjectUtils.isEmpty(object)) {
            jsonGen.writeString(object.getClass().getName());
        }else{
            jsonGen.writeString("");
        }
    }
}
