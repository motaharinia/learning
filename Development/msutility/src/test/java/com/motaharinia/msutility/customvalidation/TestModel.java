package com.motaharinia.msutility.customvalidation;

import com.motaharinia.msutility.customfield.CustomDate;
import com.motaharinia.msutility.customvalidation.companyphone.CompanyPhone;
import com.motaharinia.msutility.customvalidation.daterange.DateRange;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-18<br>
 * Time: 15:30:27<br>
 * Description:<br>
 *     کلاس مدل نمونه برای تست اعتبارسنجی
 */
public class TestModel {

    @CompanyPhone
    String companyPhoneNo;

    @DateRange
    CustomDate registerDate;
}
