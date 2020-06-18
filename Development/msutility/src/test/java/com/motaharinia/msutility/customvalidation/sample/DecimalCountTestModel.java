package com.motaharinia.msutility.customvalidation.sample;

import com.motaharinia.msutility.customvalidation.decimalcount.DecimalCount;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-18<br>
 * Time: 15:30:27<br>
 * Description:<br>
 * کلاس مدل نمونه برای تست اعتبارسنجی DecimalCount
 */
public class DecimalCountTestModel {

    @DecimalCount(min = 2, max = 4)
    private Double double1;

    @DecimalCount(exact = 3)
    private Double double2;


    //getter-setter:
    public Double getDouble1() {
        return double1;
    }

    public void setDouble1(Double double1) {
        this.double1 = double1;
    }

    public Double getDouble2() {
        return double2;
    }

    public void setDouble2(Double double2) {
        this.double2 = double2;
    }
}
