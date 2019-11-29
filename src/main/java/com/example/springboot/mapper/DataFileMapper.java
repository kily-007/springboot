package com.example.springboot.mapper;

import com.example.springboot.bean.DataFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataFileMapper extends JpaRepository<DataFile,String> {
}
