package com.motaharinia.designpattern.j2ee.presentation.frontcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {

    @Autowired
    private Dispatcher dispatcher;

    /**
     * بررسی دسترسی مشاهده
     * @param request درخواست
     * @return خروجی: نتیجه
     */
    private String isAuthenticUser(String request) {
        return ("isAuthenticUser.");
    }

    /**
     * رصد و ثبت درخواست مشاهده
     * @param request درخواست
     * @return خروجی: نتیجه رصد
     */
    private String trackRequest(String request) {
        return ("trackRequest.");
    }

    /**
     * متد مشاهده اطلاعات صفحات خانه و دانشجو
     * @param request درخواست
     * @return خروجی: صفحه مورد نظر
     */
    @RequestMapping("/frontController/show/{request}")
    public String show(@PathVariable String request) {
        String result = "";
        //رصد و ثبت درخواست مشاهده
        result += trackRequest(request);
        //بررسی دسترسی مشاهده
        result += isAuthenticUser(request);
        //مشاهده
        result += dispatcher.dispatch(request);
        return result;
    }

}
