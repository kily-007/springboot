package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InitMeterController {

    @RequestMapping("/initMeter")
    public String initMeter(){
        return "initMeter";
    }

    @RequestMapping("/evaluateMeter")
    public String  evaluateMeter(){
        return "evaluateMeter";
    }
}
