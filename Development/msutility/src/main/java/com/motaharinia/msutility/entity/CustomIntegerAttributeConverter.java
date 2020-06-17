package com.motaharinia.msutility.entity;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-12
 * Time: 01:05:58
 * Description: این کلاس مبدلی را ایجاد میکند که میتوان با گذاشتن آن بر روی فیلدهای از جنس لیست عدد صحبح در انتیتی ها آنها را در فیلد جدول دیتابیس به صورت رشته جدا شده با کاما ذخیره نمود
 */
@Converter
public class CustomIntegerAttributeConverter implements AttributeConverter<List<Integer>, String> {

    @Override
    public String convertToDatabaseColumn(List<Integer> list) {
        if(CollectionUtils.isEmpty(list)){
            return "";
        }
        return list.stream()
                .filter(element -> element != null)
                .map(String::valueOf)
                .collect(Collectors.joining(","));
    }

    @Override
    public List<Integer> convertToEntityAttribute(String joined) {
        if (StringUtils.isEmpty(joined)) {
            return new ArrayList<>();
        }
        List<String> listString = Arrays.asList(joined.split(","));
        return listString.stream().filter(StringUtils::isNotEmpty)
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }

}
