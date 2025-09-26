package com.cinnamon.cabinet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CabinetController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

}
