package com.example.springboot.service;

import com.example.springboot.bean.InvasionEvent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface InvasionService {
    //查找外部入侵事件
    Page<InvasionEvent> findPageExternalEvent(Pageable pageable);
    //查找外部入侵事件
    Page<InvasionEvent> findPageInternalEvent(Pageable pageable);
    //查找历史入侵事件
    Page<InvasionEvent> findPageInvasionHistory(Pageable pageable);
    //查找已经处理入侵事件
    Page<InvasionEvent> findPageisDealedEvent(Pageable pageable);
    //查找未处理入侵事件
    Page<InvasionEvent> findPageNotDealedEvent(Pageable pageable);
}
