package com.example.springboot.controller;

import com.example.springboot.bean.Meter;
import com.example.springboot.bean.MeterEvaluate;
import com.example.springboot.service.InitMeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class InitMeterController {

    @Autowired
    private InitMeterService initMeterService;

    @GetMapping("/initMeter")
    public String initMeter(Model model){
        List<Meter> meterList = initMeterService.findAllMeter();
        model.addAttribute("meters", meterList);
        return "initMeter";
    }


    @GetMapping("/evaluateMeter")
    public String showEvaluateMeter(){
        return "evaluateMeter";
    }


    @GetMapping("/evaluateMeterHistory")
    public String  evaluateMeter(Model model){
        List<MeterEvaluate> meterEvaluateList = initMeterService.findAllMeterEvaluate();
        model.addAttribute("meterEvaluates", meterEvaluateList);
        return "evaluateMeterHistory";
    }

}