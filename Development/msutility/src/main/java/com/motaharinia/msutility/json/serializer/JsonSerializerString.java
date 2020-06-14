package com.motaharinia.msutility.json.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-12
 * Time: 01:05:58
 * Description: این کلاس برای تبدیل رشته به رشته جیسون برای ارسال به سمت کلاینت میباشد
 * این کلاس در صورتی که رشته جیسون داده شده از نوع فیلدهای با مقادیر ثابت نباشد خودش را خروجی میدهد
 * در غیر این صورت اگر رشته مورد نظر  از نوع فیلدهای با مقادیر ثابت باشد آن را ترجمه مینماید
 */
public class JsonSerializerString extends JsonSerializer<String> {

 public MessageSource messageSource;

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public JsonSerializerString(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Override
    public void serialize(String objString, JsonGenerator jsonGen, SerializerProvider provider) throws IOException {
        if (StringUtils.isEmpty(objString) ) {
            objString = "";
        } else {
            if (objString.length() > 7) {
                if ((!ObjectUtils.isEmpty(messageSource)) && ("etcItem.".equals(objString.substring(0, 8)))) {
                    objString = messageSource.getMessage(objString, new Object[]{}, LocaleContextHolder.getLocale());
                }
            }
        }
        jsonGen.writeString(objString);
    }
}
