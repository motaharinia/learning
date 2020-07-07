package com.motaharinia.msutility.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.motaharinia.msutility.customfield.CustomDate;
import com.motaharinia.msutility.customfield.CustomDateTime;
import com.motaharinia.msutility.json.deserializer.JsonDeserializerString;
import com.motaharinia.msutility.json.serializer.*;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-12<br>
 * Time: 01:05:58<br>
 * Description:<br>
 *     این کلاس مپر برای تبدیل کلاسهای مدل به رشته جیسون و برعکس استفاده میشود. تفاوت آن نسبت به مپر پیش فرض داشتن مسیج سورس برای ترجمه است
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