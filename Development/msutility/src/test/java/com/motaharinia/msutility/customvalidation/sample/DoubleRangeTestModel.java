package com.motaharinia.msutility.customvalidation.sample;

import com.motaharinia.msutility.customvalidation.doublerange.DoubleRange;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-18<br>
 * Time: 15:30:27<br>
 * Description:<br>
 * کلاس مدل نمونه برای تست اعتبارسنجی DoubleRange
 */
public class DoubleRangeTestModel {

    @DoubleRange(min = 12, max = 13)
    private Double double1;


    //getter-setter:
    public Double getDouble1() {
        return double1;
    }

    public void setDouble1(Double double1) {
        this.double1 = double1;
    }

}
