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
import ir.mbazar.utility.presentation.caldatetime.CalDateTime;
import ir.mbazar.utility.presentation.customdatetime.CustomDate;
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
//@Component
public class JsonSerializerCustomDate extends JsonSerializer<CustomDate> {

    public JsonSerializerCustomDate() {
//        System.out.println("::::::::::::");
    }

    @Override
    public void serialize(CustomDate customDate, JsonGenerator jg, SerializerProvider sp) throws IOException, JsonProcessingException {
        try {
            Locale currentLocale = LocaleContextHolder.getLocale();

            CustomDate resultCustomDate = new CustomDate();
            resultCustomDate.setYear(customDate.getYear());
            resultCustomDate.setMonth(customDate.getMonth());
            resultCustomDate.setDay(customDate.getDay());
            if (currentLocale.getLanguage().equals("fa")) {
                String srcDateString = resultCustomDate.getYear() + "/" + resultCustomDate.getMonth() + "/" + resultCustomDate.getDay();
                String jalaliDateString;
                try {
                    jalaliDateString = CalDateTime.gregorianToJalaliDate(srcDateString, "/", "/");
                    String[] jalaliParts = jalaliDateString.split("/");
                    resultCustomDate.setYear(Integer.parseInt(jalaliParts[0]));
                    resultCustomDate.setMonth(Integer.parseInt(jalaliParts[1]));
                    resultCustomDate.setDay(Integer.parseInt(jalaliParts[2]));
                } catch (Exception ex) {
                    resultCustomDate.setYear(null);
                    resultCustomDate.setMonth(null);
                    resultCustomDate.setDay(null);
                }

            } else {

            }

            //To preserve insertion ORDER, use `LinkedHashMap` instead of normal `HashMap`
            LinkedHashMap<String, String> output = new LinkedHashMap<>();
            output.put("year", getReservedTwoCharacterFromNumber(resultCustomDate.getYear()));
            output.put("month", getReservedTwoCharacterFromNumber(resultCustomDate.getMonth()));
            output.put("day", getReservedTwoCharacterFromNumber(resultCustomDate.getDay()));
            jg.writeObject(output);
        } catch (Exception ex) {
            Logger.getLogger(JsonSerializerCustomDate.class.getName()).log(Level.SEVERE, null, ex);
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
            return null;
        }
    }
}
