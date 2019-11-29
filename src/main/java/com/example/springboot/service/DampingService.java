package com.example.springboot.service;

import com.example.springboot.bean.DampingFile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DampingService {
    Page<DampingFile> findPageDampingFile(Pageable pageable);
}
