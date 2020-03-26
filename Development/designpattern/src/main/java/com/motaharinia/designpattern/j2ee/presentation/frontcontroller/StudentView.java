package com.motaharinia.designpattern.j2ee.presentation.frontcontroller;

import org.springframework.stereotype.Component;

@Component
public class StudentView {
    /**
     * نمایش صفحه دانشجو سایت
     *
     * @return خروجی: صفحه دانشجو
     */
    public String show() {
        return ("StudentView.");
    }
}
