package com.motaharinia.msutility.json.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.motaharinia.msutility.calendar.CalDateTime;
import com.motaharinia.msutility.calendar.CustomDateTime;
import org.springframework.context.i18n.LocaleContextHolder;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-12
 * Time: 01:05:58
 * Description: این کلاس برای تبدیل کلاس تاریخ-زمان میلادی به رشته جیسون تاریخ-زمان جلالی برای ارسال به سمت کلاینت میباشد
 */
public class JsonSerializerCustomDateTime extends JsonSerializer<CustomDateTime> {

    @Override
    public void serialize(CustomDateTime customDateTime, JsonGenerator jg, SerializerProvider sp)  {
        try {
            Locale currentLocale = LocaleContextHolder.getLocale();
            if (currentLocale.getLanguage().equals("fa")) {
                Date date= CalDateTime.getDateFromCustomDateTime(customDateTime);
                customDateTime = CalDateTime.gregorianToJalaliDateTime(date);
            }
            //برای حفظ ترتیب درج بجای هشمپ از لینکدهشمپ استفاده میکنیم
            LinkedHashMap<String, String> output = new LinkedHashMap<>();
            output.put("year", customDateTime.getYear().toString());
            output.put("month",CalDateTime.fixOneDigit(customDateTime.getMonth().toString()));
            output.put("day", CalDateTime.fixOneDigit(customDateTime.getDay().toString()));
            output.put("hour", CalDateTime.fixOneDigit(customDateTime.getHour().toString()));
            output.put("minute", CalDateTime.fixOneDigit(customDateTime.getMinute().toString()));
            output.put("second", CalDateTime.fixOneDigit(customDateTime.getSecond().toString()));
            jg.writeObject(output);
        } catch (Exception ex) {
            Logger.getLogger(JsonSerializerCustomDateTime.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
