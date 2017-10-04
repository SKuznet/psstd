package ru.psstd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String getStatus(Model model) {
        model.addAttribute("status", "OK");
        return "status";
    }
}
