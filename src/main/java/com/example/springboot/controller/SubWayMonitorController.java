package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubWayMonitorController {

    @GetMapping(value = {"/subwayMonitor"})
    public String showSubWayMonitor(){
        return "subwayMonitor";
    }



}
