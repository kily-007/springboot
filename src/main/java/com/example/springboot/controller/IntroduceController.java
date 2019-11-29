package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IntroduceController {
    @GetMapping("/rough")
    public String showRough(){
        return "rough";
    }


    @GetMapping("/detail")
    public String showDetail(){
        return "detail";
    }


    @GetMapping("/systemComposition")
    public String showSystemComposition(){
        return "systemComposition";
    }

    @GetMapping("/systemContent")
    public String showSystemContent(){
        return "systemContent";
    }


}
