
package com.motaharinia.msutility.grid;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-12
 * Time: 01:05:58
 * Description: از این کلاس برای انتقال اطلاعات جستجوی پیشرفته گریدهای بک پنل به سمت سرور استفاده میشود.
 *  تا این لحظه این قابلیت برای گریدهای فرانت به دلیل عدم خریداری نسخه تجاری گرید پیاده سازی نشده است
 */


@JsonRootName(value = "searchoptions")
public class GridSearchOptionsModel implements Serializable {
    
    // نوع جستجو که اند یا ار هست
    //and , or
    private String stype;
    //لیستی از اپراتورهای جستجو که میتواند در کامبو جستجوی پیشرفته بیاید
    //مانند : like , equal , bigger , less , ....
    private String[] sopt; //array of search operations
    //مقداری که کاربر در پنجره جستجوی پیشرفته گریدهای بک پنل برای اپراتور وارد میکند
    private String value; //used when column is combo box
    
    public GridSearchOptionsModel(String stype, String[] sopt){
        this.stype = stype;
        this.sopt = sopt;
    }
    
    public GridSearchOptionsModel(String stype, String[] sopt, String value){
        this.stype = stype;
        this.sopt = sopt;
        this.value = value;
    }

    public GridSearchOptionsModel() {
    }

    //getter-setter:
    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype;
    }

    public String[] getSopt() {
        return sopt;
    }

    public void setSopt(String[] sopt) {
        this.sopt = sopt;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
