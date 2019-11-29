package com.example.springboot.mapper;

import com.example.springboot.bean.DataLoad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataLoadMapper extends JpaRepository<DataLoad,String> {
}
