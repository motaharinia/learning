package com.motaharinia.msutility.string;

import org.jsoup.Jsoup;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Random;


public class StringTools {

    public enum StringType {

        characterAll("characterAll"),
        characterLower("characterLower"),
        characterUpper("characterUpper"),
        number("number"),
        characterNumber("characterNumber"),
        punc("punc"),
        characterNumberPunc("characterNumberPunc"),
        characterNumberUnderline("characterNumberUnderline"),
        numberUnderline("numberUnderline");
        private final String value;

        private StringType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public static String generateMD5Hash(String input, Integer resultLength) throws Exception {

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] md5sum = md.digest(input.getBytes());
        String output = String.format("%032x", new BigInteger(1, md5sum));
        if (resultLength <= input.length()) {
            return output.substring(0, resultLength);
        } else {
            return output;
        }
    }

    //Remove HTML tag from java String  
    public static String removeHtml(String htmlString) {
        return Jsoup.parse(htmlString).text();
    }

    //generate short string from input string
    public static String summerizeString(String input, Integer charNumber) {
        String result;
        if (input.length() < charNumber) {
            result = input;
        } else {
            result = input.substring(0, charNumber) + "...";
        }
        return result;
    }

    //Highlight part of string
    public static String highlight(String inputText, String search) {

        return (inputText != null) ? inputText.replaceAll(search, "<span class='highlight'>" + search + "</span>") : null;
    }

    public static String generateRandomString(StringType stringType, Integer length, Boolean withLeadingZero) {
        String characterLower = "abcdefghigklmnopqrstuvwxyz";
        String characterUpper = "ABCDEFGHIJKLMNPQRSTUVWXYZ";
        String number = "1234567890";
        String punc = "_-$#@%^*&=+";
        String characters = "";

        switch (stringType.getValue()) {
            case "characterAll":
                characters = characterLower + characterUpper;
                break;
            case "characterLower":
                characters = characterLower;
                break;
            case "characterUpper":
                characters = characterUpper;
                break;
            case "number":
                characters = number;
                break;
            case "characterNumber":
                characters = characterLower + characterUpper + number;
                break;
            case "punc":
                characters = punc;
                break;
            case "characterNumberPunc":
                characters = characterLower + characterUpper + number + punc;
                break;
            case "characterNumberUnderline":
                characters = characterLower + characterUpper + number + "_";
                break;
            case "numberUnderline":
                characters = number + "_";
                break;
        }
        String result = "";
        Random rand = new Random();
        Integer charactersLength = characters.length();
        int randomNum = 0;
        Character randomChar;
        for (int i = 0; i < length; i++) {
            randomNum = rand.nextInt(charactersLength);
            randomChar = characters.charAt(randomNum);
            if ((i == 0) && (withLeadingZero == false)) {
                while (((int) randomChar == 48)) {
                    randomNum = rand.nextInt((charactersLength - 1));
                    randomChar = characters.charAt(randomNum);
                }
            }

            result += randomChar;

        }
        return result;
    }

}
