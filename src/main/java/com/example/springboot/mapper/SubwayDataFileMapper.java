package com.example.springboot.mapper;

import com.example.springboot.bean.SubwayDataFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubwayDataFileMapper extends JpaRepository<SubwayDataFile,String> {
}
