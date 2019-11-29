package com.example.springboot.service.impl;

import com.example.springboot.bean.DataFile;
import com.example.springboot.bean.SubwayCount;
import com.example.springboot.bean.SubwayDataFile;
import com.example.springboot.mapper.DataFileMapper;
import com.example.springboot.mapper.SubwayCountMapper;
import com.example.springboot.mapper.SubwayDataFileMapper;
import com.example.springboot.service.DataManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DataManageServiceImpl implements DataManageService {

    @Autowired
    private DataFileMapper dataFileMapper;
    @Autowired
    private SubwayDataFileMapper subwayDataFileMapper;
    @Autowired
    private SubwayCountMapper subwayCountMapper;



    @Override
    public Page<DataFile> findPageDataFile(Pageable pageable) {
        return dataFileMapper.findAll(pageable);
    }

    @Override
    public Page<SubwayDataFile> findPageSubwayDataFile(Pageable pageable) {
        return subwayDataFileMapper.findAll(pageable);
    }
    @Override
    public Page<SubwayCount> findPageSubwayCount(Pageable pageable) {
        return subwayCountMapper.findAll(pageable);
    }
}
