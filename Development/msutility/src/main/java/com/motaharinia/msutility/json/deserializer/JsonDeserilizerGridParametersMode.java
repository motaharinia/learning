package com.motaharinia.msutility.json.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.motaharinia.msutility.grid.GridFilterModel;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 *
 * @author Administrator
 */
//@Component
public class JsonDeserilizerGridParametersMode extends JsonDeserializer<String> {

    @Override
    public String deserialize(JsonParser jp, DeserializationContext dc) throws IOException {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String parametersModeHash = jp.getText();
        if(parametersModeHash == null || parametersModeHash.equals("default") || parametersModeHash.equals(""))
            return "default";
        else{
            return GridFilterModel.decryptParametersMode(parametersModeHash, request.getRemoteAddr());
        }

    }

}
