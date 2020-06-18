package com.motaharinia.msutility.customfield;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 *
 * @author administrator
 */
public class CustomHtmlString implements Serializable{

    private String customHtmlString;


    public CustomHtmlString() {

    }

    @JsonCreator
    public CustomHtmlString(@JsonProperty("customHtmlString") String customHtmlString) {
        this.setCustomHtmlString(customHtmlString);
    }

    @Override
    public String toString() {
        return "CustomHtmlString{" + "customHtmlString=" + customHtmlString + '}';
    }
    
    public static Boolean isSet(CustomHtmlString  customHtmlString) {
        if (customHtmlString == null) {
            return false;
        }
        if (customHtmlString.getCustomHtmlString() == null ) {
            return false;
        }
        return true;
    }

    //getter-setter:
    public String getCustomHtmlString() {
        return customHtmlString;
    }

    public void setCustomHtmlString(String customHtmlString) {
        this.customHtmlString = customHtmlString;
    }
}
