package com.motaharinia.designpattern.j2ee.presentation.compositeview;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CompositeViewController {
    @RequestMapping("/compositeview/welcome")
    public String firstPage() {
        return "cv_welcome";
    }
}
