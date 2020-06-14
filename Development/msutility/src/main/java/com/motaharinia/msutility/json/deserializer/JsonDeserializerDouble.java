package com.motaharinia.msutility.json.deserializer;

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package ir.mbazar.utility.presentation.json;
//
//import com.fasterxml.jackson.core.JsonParser;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.DeserializationContext;
//import com.fasterxml.jackson.databind.JsonDeserializer;
//import java.io.IOException;
//
///**
// *
// * @author dev2
// */
////@Component
//public class JsonDeserializerDouble extends JsonDeserializer<Double> {
//
//    @Override
//    public Double deserialize(JsonParser jp, DeserializationContext dc) throws IOException, JsonProcessingException {
//        String doubleStr = jp.getText();
//        System.out.println("JsonDeserializerDouble doubleStr:" + doubleStr);
//        //if (dateStr.matches("([0-9]*)\\.[0]")) {   ^(?=.*\d)\d*(?:\.\d\d)?$
//        if (doubleStr.matches("(?<=\\x20?)(?:\\-?)\\d+(?:\\.\\d{1,2})?")) {
//            System.out.println("okkkkkkk");
//            return Double.parseDouble(doubleStr);
//        } else {
//            System.out.println("no okkkkkkkkk");
//            return null;
//        }
//
//    }
//}
