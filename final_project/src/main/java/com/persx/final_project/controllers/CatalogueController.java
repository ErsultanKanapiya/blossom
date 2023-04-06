package com.persx.final_project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class CatalogueController {
    @GetMapping("/catalogue")
    public String catalogue(Model model){
        return "catalogue";
    }
}
