package com.example.springboot.service.impl;

import com.example.springboot.bean.DampingFile;
import com.example.springboot.mapper.DampingFileMapper;
import com.example.springboot.service.DampingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DampingServiceImpl implements DampingService {

    @Autowired
    private DampingFileMapper dampingFileMapper;

    @Override
    public Page<DampingFile> findPageDampingFile(Pageable pageable) {
        return dampingFileMapper.findAll(pageable);
    }
}
