package com.example.springboot.service;

import com.example.springboot.bean.DataFile;
import com.example.springboot.bean.SubwayCount;
import com.example.springboot.bean.SubwayDataFile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DataManageService {

    Page<DataFile> findPageDataFile(Pageable pageable);

    Page<SubwayDataFile> findPageSubwayDataFile(Pageable pageable);

    Page<SubwayCount> findPageSubwayCount(Pageable pageable);

}
