package com.persx.final_project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class PriceController {
    @GetMapping("/price")
    public String price(Model model){
        return "pricing";
    }
}
