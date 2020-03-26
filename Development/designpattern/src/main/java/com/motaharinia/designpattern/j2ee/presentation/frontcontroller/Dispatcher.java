package com.motaharinia.designpattern.j2ee.presentation.frontcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dispatcher {
    //صفحه دانشجو سایت
    @Autowired
    private StudentView studentView;

    //صفحه خانه سایت
    @Autowired
    private HomeView homeView;

    /**
     * متد تصمیم گیر و توزیع کننده در مورد انتخاب خروجی طبق درخواست
     *
     * @param request درخواست
     * @return خروجی: صفحه مورد نظر
     */
    public String dispatch(String request) {
        if (request.equalsIgnoreCase("STUDENT")) {
            return studentView.show();
        } else {
            return homeView.show();
        }
    }
}
