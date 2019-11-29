package com.example.springboot.service;

import com.example.springboot.bean.Meter;
import com.example.springboot.bean.MeterEvaluate;

import java.util.List;

public interface InitMeterService {
    List<Meter> findAllMeter();

    List<MeterEvaluate> findAllMeterEvaluate();
}
