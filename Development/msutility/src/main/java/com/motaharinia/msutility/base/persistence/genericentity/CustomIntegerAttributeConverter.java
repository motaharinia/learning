package com.motaharinia.msutility.base.persistence.genericentity;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 *
 * @author Dev1
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
