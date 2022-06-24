package com.jovo.springbootsampleapp.controllers;

import com.jovo.plainjavalibrary.services.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final SomeService someService;

    @Autowired
    public HomeController(
            /*SomeService someService*/
            /*@Qualifier("SomeServiceImpl1") SomeService someService*/
            @Qualifier("SomeServiceImpl2") SomeService someService) {
        this.someService = someService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "Result = " + someService.someMethod(1, "aaaa");
    }
}
