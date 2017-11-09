package ru.psstd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.psstd.model.About;
import ru.psstd.service.AboutService;

@Controller
public class MainController {
    @Autowired
    private AboutService aboutService;

    @RequestMapping("/")
    public String getStatus(Model model) {
        return "status";
    }

    @ResponseBody
    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public About getAboutInfo() {
        return aboutService.getInfo();
    }

    @RequestMapping("/aboutpage")
    public String getI(){
        return "about";
    }
}
