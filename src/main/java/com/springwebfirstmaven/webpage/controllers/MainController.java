package com.springwebfirstmaven.webpage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title","SpringBootstrap");
        return "home";
    }
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title","About us");
        return "about";
    }
    @GetMapping("/support")
    public String support(Model model) {
        model.addAttribute("title","Support");
        return "support";

    }
    @GetMapping("/newsmain")
    public String newsmain(Model model) {
        model.addAttribute("title", "News");
        return "newsmain";
    }
}