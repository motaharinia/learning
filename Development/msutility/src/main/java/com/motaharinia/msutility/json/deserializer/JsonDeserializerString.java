package com.motaharinia.msutility.json.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.motaharinia.msutility.string.StringTools;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-12
 * Time: 01:05:58
 * Description: این کلاس برای تبدیل رشته جیسون کلاینت به رشته میباشد
 * این کلاس در صورتی که رشته جیسون داده شده از نوع فیلدهای با تگ وب باشد آن را خروجی میدهد
 * در غیر این صورت اگر فیلد رشته مورد نظر فیلد رشته ساده باشد تگهای وب را که مشکل امنیتی ممکن است ایجاد کنند از رشته جیسون حذف مینماید
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
}
