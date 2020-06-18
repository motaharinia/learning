package com.motaharinia.msutility.customvalidation.sample;

import com.motaharinia.msutility.customfield.CustomDate;
import com.motaharinia.msutility.customvalidation.daterange.DateRange;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-18<br>
 * Time: 15:30:27<br>
 * Description:<br>
 * کلاس مدل نمونه برای تست اعتبارسنجی DateRange
 */
public class DateRangeTestModel {

    @DateRange(from = "1399-01-01", to = "1399-12-29")
    private CustomDate registerDate;

    @DateRange(from = "1399-01-01")
    private CustomDate createDate;

    @DateRange(to = "1399-12-29")
    private CustomDate updateDate;

    @DateRange(from = "today", to = "1399-12-29")
    private CustomDate deleteDate;

    //getter-setter:
    public CustomDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(CustomDate registerDate) {
        this.registerDate = registerDate;
    }

    public CustomDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(CustomDate createDate) {
        this.createDate = createDate;
    }

    public CustomDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(CustomDate updateDate) {
        this.updateDate = updateDate;
    }

    public CustomDate getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(CustomDate deleteDate) {
        this.deleteDate = deleteDate;
    }
}
