package com.nutriheal.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/admin")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to NutriHeal!");
        model.addAttribute("description", "AI-powered nutrition recommendation system");
        return "index";
    }
    
}