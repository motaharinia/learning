package com.motaharinia.designpattern.j2ee.presentation.frontcontroller;

import org.springframework.stereotype.Component;

@Component
public class HomeView {
    /**
     * نمایش صفحه خانه سایت
     *
     * @return خروجی: صفحه خانه
     */
    public String show() {
        return ("HomeView.");
    }
}
