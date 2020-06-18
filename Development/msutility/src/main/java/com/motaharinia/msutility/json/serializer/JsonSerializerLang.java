package com.motaharinia.msutility.json.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import java.io.IOException;
import java.util.Locale;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-12<br>
 * Time: 01:05:58<br>
 * Description:<br>
 *     این کلاس برای تبدیل رشته حاوی کلید ترجمه به رشته جیسون ترجمه شده برای ارسال به سمت کلاینت میباشد
 */
@Component
public class JsonSerializerLang extends JsonSerializer<String> {

    @Override
    public void serialize(String langKey, JsonGenerator gen, SerializerProvider provider) throws IOException, JsonProcessingException {
        String langKeyTranslated = "";
        WebApplicationContext webAppContext = ContextLoader.getCurrentWebApplicationContext();
        MessageSource messageSource = (MessageSource)webAppContext.getBean("messageSource");
        Locale locale = LocaleContextHolder.getLocale();
        langKeyTranslated = messageSource.getMessage(langKey, new Object[]{}, locale);
        gen.writeString(langKeyTranslated);

    }

}
