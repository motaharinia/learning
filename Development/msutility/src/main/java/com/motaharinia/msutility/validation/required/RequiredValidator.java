package com.motaharinia.msutility.validation.required;

import com.motaharinia.msutility.customfield.CustomDate;
import com.motaharinia.msutility.customfield.CustomDateTime;
import com.motaharinia.msutility.customfield.CustomHtmlString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

/**
 *
 * @author administrator
 */
public class RequiredValidator implements ConstraintValidator<Required, Object> {

    private static final Logger logger = LoggerFactory.getLogger(RequiredValidator.class);
    
    @Override
    public void initialize(Required a) {
    }

    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext cvc) {

        if (obj == null) {
            return false;
        }
        
        boolean result = true;
        if(obj instanceof String){
            result = validateString((String)obj);
        }
        
        else if (obj instanceof CustomDate) {
            result = validateDate((CustomDate) obj);
        } 
        
        else if (obj instanceof CustomDateTime) {
            result = validateDateTime((CustomDateTime) obj);
        } 
        
        else if(obj instanceof CustomHtmlString){
            result = validateCustomString((CustomHtmlString) obj);
        }
        
        else if(obj instanceof List){
            result = validateList((List<Object>)obj);
        }
        
        return result;
    }
    
    private boolean validateString(String str){
        return !(str.equals(""));
    }

    private boolean validateDate(CustomDate customDate) {
        logger.info("year: " + customDate.getYear() + " month: " + customDate.getMonth() + " day: " + customDate.getDay());
        return !(customDate.getYear() == null || customDate.getMonth() == null || customDate.getDay() == null);
    }

    private boolean validateDateTime(CustomDateTime customDateTime) {
        return !(customDateTime.getYear() == null
                || customDateTime.getMonth() == null || customDateTime.getDay() == null
                || customDateTime.getHour() == null || customDateTime.getMinute() == null || customDateTime.getSecond() == null);
    }
    
    private boolean validateList(List<Object> list){
        return !list.isEmpty();
    }
    
    private boolean validateCustomString(CustomHtmlString customHtmlString){
        return !customHtmlString.getCustomHtmlString().equals("");
    }

}
