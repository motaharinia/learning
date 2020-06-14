
package com.motaharinia.msutility.json.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.motaharinia.msutility.calendar.CalDateTime;
import com.motaharinia.msutility.calendar.CustomDateTime;
import org.springframework.context.i18n.LocaleContextHolder;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author administrator
 */
public class JsonSerializerCustomDateTime extends JsonSerializer<CustomDateTime> {

    @Override
    public void serialize(CustomDateTime customDateTime, JsonGenerator jg, SerializerProvider sp) throws IOException, JsonProcessingException {
        try {
            Locale currentLocale = LocaleContextHolder.getLocale();

            CustomDateTime resultCustomDateTime = new CustomDateTime();
            resultCustomDateTime.setYear(customDateTime.getYear());
            resultCustomDateTime.setMonth(customDateTime.getMonth());
            resultCustomDateTime.setDay(customDateTime.getDay());
            resultCustomDateTime.setHour(customDateTime.getHour());
            resultCustomDateTime.setMinute(customDateTime.getMinute());
            resultCustomDateTime.setSecond(customDateTime.getSecond());
            if (currentLocale.getLanguage().equals("fa")) {
                String srcDateTimeString = resultCustomDateTime.getYear() + "/" + resultCustomDateTime.getMonth() + "/" + resultCustomDateTime.getDay() + " " + resultCustomDateTime.getHour() + ":" + resultCustomDateTime.getMinute() + ":" + resultCustomDateTime.getSecond();
                String jalaliDateString;
                try {
                    jalaliDateString = CalDateTime.gregorianToJalaliDateTime(srcDateTimeString, "/", "/");
                    String[] dateTimeParts = jalaliDateString.split(" ");
                    String[] dateParts = dateTimeParts[0].split("/");
                    String[] timeParts = dateTimeParts[1].split(":");
                    resultCustomDateTime.setYear(Integer.parseInt(dateParts[0]));
                    resultCustomDateTime.setMonth(Integer.parseInt(dateParts[1]));
                    resultCustomDateTime.setDay(Integer.parseInt(dateParts[2]));

                    resultCustomDateTime.setHour(Integer.parseInt(timeParts[0]));
                    resultCustomDateTime.setMinute(Integer.parseInt(timeParts[1]));
                    resultCustomDateTime.setSecond(Integer.parseInt(timeParts[2]));
                } catch (Exception ex) {
                    resultCustomDateTime.setYear(null);
                    resultCustomDateTime.setMonth(null);
                    resultCustomDateTime.setDay(null);
                    resultCustomDateTime.setHour(null);
                    resultCustomDateTime.setMinute(null);
                    resultCustomDateTime.setSecond(null);
                }

            }
            //To preserve insertion ORDER, use `LinkedHashMap` instead of normal `HashMap`
            LinkedHashMap<String, String> output = new LinkedHashMap<>();
            output.put("year", getReservedTwoCharacterFromNumber(resultCustomDateTime.getYear()));
            output.put("month", getReservedTwoCharacterFromNumber(resultCustomDateTime.getMonth()));
            output.put("day", getReservedTwoCharacterFromNumber(resultCustomDateTime.getDay()));
            output.put("hour", getReservedTwoCharacterFromNumber(resultCustomDateTime.getHour()));
            output.put("minute", getReservedTwoCharacterFromNumber(resultCustomDateTime.getMinute()));
            output.put("second", getReservedTwoCharacterFromNumber(resultCustomDateTime.getSecond()));
            jg.writeObject(output);
        } catch (Exception ex) {
            Logger.getLogger(JsonSerializerCustomDateTime.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String getReservedTwoCharacterFromNumber(Integer input) {
        if (input != null) {
            if (input.toString().length() < 2) {
                return "0" + input.toString();
            } else {
                return input.toString();
            }
        } else {
            return "";
        }
    }
}
