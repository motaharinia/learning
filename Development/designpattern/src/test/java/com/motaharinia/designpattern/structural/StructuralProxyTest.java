package com.motaharinia.designpattern.structural;

import com.motaharinia.designpattern.structural.proxy.DataBase;
import com.motaharinia.designpattern.structural.proxy.OfficeInternetAccess;
import com.motaharinia.designpattern.structural.proxy.ProxyInternetAccess;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/proxy-pattern
//Simply, proxy means an object representing another object.
//According to Gang of Four (GoF)(Design Pattern book authers Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides), a Proxy Pattern "provides the control for accessing the original object".
//So, we can perform many operations like hiding the information of original object, on demand loading etc.
//به عبارت ساده ، پراکسی به معنای یک شیء است که نمایانگر یک شیء دیگر است.
//طبق گفته GoF که مخفف گروه چهار نفره نویسنده کتاب Design Pattern هستند ، یک الگوی پروکسی "کنترل دسترسی به شی اصلی را فراهم می کند".
//بنابراین ، ما می توانیم بسیاری از عملیات ها مانند مخفی کردن اطلاعات شی اصلی ، بارگیری در صورت تقاضا و غیره را انجام دهیم.
public class StructuralProxyTest {

    //شیی دسترسی کارمندان به اینترنت
    OfficeInternetAccess access;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        DataBase.employeeRoleHashMap.put("Motaharinia",8);
        DataBase.employeeRoleHashMap.put("Ahmadi",10);
        DataBase.employeeInternetAccessSet.clear();
    }

    /**
     * این متد Proxy Design Pattern را تست میکند
     * تست کارمند با سطح دسترسی پایین که نباید به اینترنت دسترسی پیدا کند
     */
    @Test
    void proxyInternetAccessDenyTest() {
        access = new ProxyInternetAccess("Motaharinia");
        access.grantInternetAccess();
        Assertions.assertEquals(Boolean.FALSE, DataBase.employeeInternetAccessSet.contains("Motaharinia"));
    }

    /**
     * این متد Proxy Design Pattern را تست میکند
     * تست کارمند با سطح دسترسی پایین که باید بتواند به اینترنت دسترسی پیدا کند
     */
    @Test
    void proxyInternetAccessAllowTest() {
        access = new ProxyInternetAccess("Ahmadi");
        access.grantInternetAccess();
        Assertions.assertEquals(Boolean.TRUE, DataBase.employeeInternetAccessSet.contains("Ahmadi"));
    }
}
