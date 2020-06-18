/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.motaharinia.msutility.validation.uniquearray;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Field;
import java.util.List;

/**
 *
 * @author administrator
 */
public class UniqueArrayValidator implements ConstraintValidator<UniqueArray, List> {

     private static final Logger logger = LoggerFactory.getLogger(UniqueArrayValidator.class);
    
    private String[] fields;

    @Override
    public void initialize(UniqueArray a) {
        fields = a.fields();
    }

    @Override
    public boolean isValid(List list, ConstraintValidatorContext cvc) {
        if(list == null || list.isEmpty()){
            return true;
        }
        boolean repeat = false;
        if (fields == null || fields.length == 0) {
            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    logger.info("i: " + list.get(i));
                    logger.info("j: " + list.get(i));
                    if (list.get(i).equals(list.get(j))) {
                        repeat = true;
                        break;
                    }
                }
            }
        }
        else {
            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if(checkTwoObjectEquality(list.get(i), list.get(j))){
                        repeat = true;
                        break;
                    }
                }
            }
        }

        return !repeat;
    }

    private Object getObjectFieldValue(Object obj, String fieldName) {
        try {
            Field field = obj.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(obj);
        }
        catch (Exception e) {
            return null;
        }
    }

    private Boolean checkTwoObjectEquality(Object obj1, Object obj2) {
        for(String field: fields){
            if(!getObjectFieldValue(obj1, field).equals(getObjectFieldValue(obj2, field))){
                return false;
                
            }
        }
        
        return true;
    }

}
