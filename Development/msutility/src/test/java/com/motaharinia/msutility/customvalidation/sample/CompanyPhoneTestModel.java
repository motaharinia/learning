package com.motaharinia.msutility.customvalidation.sample;

import com.motaharinia.msutility.customvalidation.companyphone.CompanyPhone;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-18<br>
 * Time: 15:30:27<br>
 * Description:<br>
 *     کلاس مدل نمونه برای تست اعتبارسنجی CompanyPhone
 */
public class CompanyPhoneTestModel {

    @CompanyPhone
    private String companyPhoneNo;

    //getter-setter:

    public String getCompanyPhoneNo() {
        return companyPhoneNo;
    }

    public void setCompanyPhoneNo(String companyPhoneNo) {
        this.companyPhoneNo = companyPhoneNo;
    }
}
