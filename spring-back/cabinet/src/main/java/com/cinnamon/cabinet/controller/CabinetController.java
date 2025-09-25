package com.cinnamon.cabinet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CabinetController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
