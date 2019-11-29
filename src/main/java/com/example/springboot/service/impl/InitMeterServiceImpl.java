package com.example.springboot.service.impl;

import com.example.springboot.bean.Meter;
import com.example.springboot.bean.MeterEvaluate;
import com.example.springboot.mapper.MeterEvaluateMapper;
import com.example.springboot.mapper.MeterMapper;
import com.example.springboot.service.InitMeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InitMeterServiceImpl implements InitMeterService {
    @Autowired
    private MeterMapper meterMapper;

    @Autowired
    private MeterEvaluateMapper meterEvaluateMapper;


    @Override
    public List<Meter> findAllMeter() {
        return meterMapper.findAll();
    }

    @Override
    public List<MeterEvaluate> findAllMeterEvaluate() {
        return meterEvaluateMapper.findAll();
    }


}
