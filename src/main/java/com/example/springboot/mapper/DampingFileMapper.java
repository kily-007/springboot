package com.example.springboot.mapper;

import com.example.springboot.bean.DampingFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DampingFileMapper extends JpaRepository<DampingFile,String> {
}
