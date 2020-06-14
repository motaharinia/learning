
package com.motaharinia.msutility.base.persistence;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author Dev3
 */
public class OracleUtility {


    public static final Integer BIG_DECIMAL_SCALE = 5;
    public static final String COLUMN_DEFINITION_AMOUNT_194 = "DECIMAL(19,4)";
    public static final String COLUMN_DEFINITION_DOUBLE_84 = "DECIMAL(8,4)";
    public static final String COLUMN_DEFINITION_DOUBLE_144 = "DECIMAL(14,4)";
    public static final String COLUMN_DEFINITION_DATE = "DATE";
    public static final String COLUMN_DEFINITION_PRIMARY_KEY = "NUMBER";

    public static String toDate(String dateString) {
        if (dateString == null) {
            dateString = "null";
        }
        return "TO_DATE('" + dateString + "','YYYY-MM-DD HH24:MI:SS')";
    }

    public static String toDate(Date date) {
        String dateString = "";
        if (date == null) {
            dateString = "null";
        } else {
            dateString = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        }
        return toDate(dateString);
    }

    public static String fixQueryIN(String jpqlFieldName, String itemCsv) throws Exception {
        return fixQueryIN(jpqlFieldName, itemCsv, " IN ");
    }

    public static String fixQueryNOTIN(String jpqlFieldName, String itemCsv) throws Exception {
        return fixQueryIN(jpqlFieldName, itemCsv, " NOT IN ");
    }

    private static String fixQueryIN(String jpqlFieldName, String itemCsv, String INOrNOTIN) throws Exception {
        String resultIN = "";
        String result = "";

        List<String> myList = new ArrayList<>(Arrays.asList(itemCsv.split(",")));

        Integer myListSize = myList.size();
        Integer i = 1;
        Integer counter = 1;
        for (String item : myList) {
            if (i < 1000) {
                //-----------------------------------
                //-----------------------------------
                if (resultIN != "") {
                    resultIN = resultIN + ",";
                }
                resultIN = resultIN + item;

                //-----------------------------------
                //-----------------------------------
                if (counter.equals(myListSize)) {

                    if (result != "") {
                        result = result + " OR ";
                    }
                    result = result + "(" + jpqlFieldName + INOrNOTIN + "(" + resultIN + "))";

                }
                i++;
            } else {
                //-----------------------------------
                //وقتی مقدار i برابر 1000 میشود در else میفتد و در اینجا باید مقدار 1000 رو به resultIN اضافه کنم
                //-----------------------------------
                if (resultIN != "") {
                    resultIN = resultIN + ",";
                }
                resultIN = resultIN + item;

                //-----------------------------------
                //ایجاد شرط restriction
                //-----------------------------------
                if (result != "") {
                    result = result + " OR ";
                }
                result = result + "(" + jpqlFieldName + INOrNOTIN + "(" + resultIN + "))";

                //-----------------------------------
                //مقادیر i و resultIN بعد از هر 1000 تا ریست میشوند
                //-----------------------------------
                resultIN = "";
                i = 1;
            }
            counter++;

        }
        //System.out.println("result : " + result);
        return "(" + result + ")";

    }

}

/**
 * سمپل ست کردن scale برای عملیات bigDecimal public static void main(String[]
 * args) {
 * <p>
 * final BigDecimal bg1 = new BigDecimal("5.655388"); final BigDecimal bg2 = new
 * BigDecimal("-1").multiply(bg1);
 * <p>
 * جمع// System.out.println("add = " +
 * bg1.add(bg1).setScale(OracleUtility.BIG_DECIMAL_SCALE,BigDecimal.ROUND_HALF_DOWN));
 * تفریق// System.out.println("subtract = " +
 * bg1.subtract(bg2).setScale(OracleUtility.BIG_DECIMAL_SCALE,BigDecimal.ROUND_HALF_DOWN));
 * ضرب// System.out.println("multiply = " +
 * bg1.multiply(bg2).setScale(OracleUtility.BIG_DECIMAL_SCALE,BigDecimal.ROUND_HALF_DOWN));
 * تقسیم// System.out.println("divide = " +
 * bg1.divide(bg1,OracleUtility.BIG_DECIMAL_SCALE,BigDecimal.ROUND_HALF_DOWN));
 * <p>
 * // System.out.println("مثبت/////////////////////////////////"); //
 * System.out.println("CEILING = " + bg1.setScale(scale,RoundingMode.CEILING));
 * // System.out.println("DOWN = " + bg1.setScale(scale,RoundingMode.DOWN)); //
 * System.out.println("FLOOR = " + bg1.setScale(scale,RoundingMode.FLOOR)); //
 * System.out.println("UP = " + bg1.setScale(scale,RoundingMode.UP)); // //
 * System.out.println("HALF_EVEN = " +
 * bg1.setScale(scale,RoundingMode.HALF_EVEN)); // System.out.println("HALF_DOWN
 * = " + bg1.setScale(scale,RoundingMode.HALF_DOWN)); //
 * System.out.println("HALF_UP = " + bg1.setScale(scale,RoundingMode.HALF_UP));
 * // // System.out.println("منفی/////////////////////////////////"); // //
 * System.out.println("CEILING = " + bg2.setScale(scale,RoundingMode.CEILING));
 * // System.out.println("DOWN = " + bg2.setScale(scale,RoundingMode.DOWN)); //
 * System.out.println("FLOOR = " + bg2.setScale(scale,RoundingMode.FLOOR)); //
 * System.out.println("UP = " + bg2.setScale(scale,RoundingMode.UP)); // //
 * System.out.println("HALF_EVEN = " +
 * bg2.setScale(scale,RoundingMode.HALF_EVEN)); // System.out.println("HALF_DOWN
 * = " + bg2.setScale(scale,RoundingMode.HALF_DOWN)); //
 * System.out.println("HALF_UP = " + bg2.setScale(scale,RoundingMode.HALF_UP));
 * <p>
 * }
 */
