package com.springwebfirstmaven.webpage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/news")
    public String newsMain(Module module) {
        return "newsmain";
    }

    //test

}
