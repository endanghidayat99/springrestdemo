package com.endang.restfulldemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductViewController {

    @GetMapping("/")
    public String view(Model model){

        return "viewProduct";

    }
}
