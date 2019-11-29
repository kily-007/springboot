package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

//    @GetMapping("/dataLoad")
//    public String showIndex(@RequestParam(required = false,defaultValue = "0")int page,
//                            @RequestParam(required = false,defaultValue = "10")int limit, Model model){
//        System.out.println(limit+" "+page);
//        model.addAttribute("limit",limit);
//        model.addAttribute("page",page);
//        return "dataLoadManage";
//    }
}
