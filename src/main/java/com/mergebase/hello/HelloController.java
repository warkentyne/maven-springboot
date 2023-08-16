package com.mergebase.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @Value("${spring.application.name}")
    String appName;

    int counter;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        model.addAttribute("counter", counter);
        return "home";
    }

    @GetMapping("/inc")
    public String increment(Model model) {
        model.addAttribute("appName", appName);
        counter++;
        model.addAttribute("counter", counter);
        return "home";
    }

    @GetMapping("/dec")
    public String decrement(Model model) {
        model.addAttribute("appName", appName);
        counter--;
        model.addAttribute("counter", counter);
        return "home";
    }

}