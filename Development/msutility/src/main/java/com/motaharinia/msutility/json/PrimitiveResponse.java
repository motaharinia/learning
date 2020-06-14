/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.motaharinia.msutility.json;

/**
 *
 * @author Administrator
 */
public class PrimitiveResponse {

    private Object response;

    public PrimitiveResponse(Object response) {
        this.response = response;
    }

    public PrimitiveResponse() {
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

}
