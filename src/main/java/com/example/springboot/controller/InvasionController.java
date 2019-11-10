package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvasionController {

    @GetMapping("/internalInvasion")
    public String showInternalInvasion(){
        return "internalInvasion";
    }

    @GetMapping("/externalInvasion")
    public String showExternalInvasion(){
        return "externalInvasion";
    }

}
