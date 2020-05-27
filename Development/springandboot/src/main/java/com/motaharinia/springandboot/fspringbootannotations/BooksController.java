package com.motaharinia.springandboot.fspringbootannotations;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BooksController {
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public List<String> getBooksByName() {
        return null;
    }
}