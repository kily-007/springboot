package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StructureController {
    @GetMapping("/statusPress")
    public String showStatusPress() {
        return "statusPress";
    }

    @GetMapping("/statusTemperature")
    public String showStatusTemperature() {
        return "statusTemperature";
    }

    @GetMapping("/statusVibration")
    public String showStatusVibration() {
        return "statusVibration";
    }


}
