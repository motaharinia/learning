package com.motaharinia.msutility.json.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.motaharinia.msutility.calendar.CalDateTime;
import org.springframework.context.i18n.LocaleContextHolder;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-12
 * Time: 01:05:58
 * Description:
 * این کلاس برای تبدیل کلاس Date میلادی به رشته جیسون تاریخ-زمان جلالی برای ارسال به سمت کلاینت میباشد
 */
public class JsonSerializerDate extends JsonSerializer<Date> {

    @Override
    public void serialize(Date date, JsonGenerator jsonGen, SerializerProvider sp) throws IOException, JsonProcessingException {
        try {
            jsonGen.writeString( CalDateTime.fixToLocaleDate(date,"/",LocaleContextHolder.getLocale()));
        } catch (ParseException ex) {
            Logger.getLogger(JsonSerializerCustomDateTime.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
