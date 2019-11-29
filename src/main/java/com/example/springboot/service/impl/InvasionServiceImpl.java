package com.example.springboot.service.impl;

import com.example.springboot.bean.InvasionEvent;
import com.example.springboot.mapper.InvasionEventMapper;
import com.example.springboot.service.InvasionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class InvasionServiceImpl implements InvasionService {
    @Autowired
    private InvasionEventMapper invasionEventMapper;


    @Override
    public Page<InvasionEvent> findPageExternalEvent(Pageable pageable) {
        return invasionEventMapper.findExternalEventsByInvasionType(pageable,"外部入侵");
    }

    @Override
    public Page<InvasionEvent> findPageInternalEvent(Pageable pageable) {
        return invasionEventMapper.findExternalEventsByInvasionType(pageable,"内部入侵");
    }

    @Override
    public Page<InvasionEvent> findPageInvasionHistory(Pageable pageable) {
        return invasionEventMapper.findAll(pageable);
    }

    @Override
    public Page<InvasionEvent> findPageisDealedEvent(Pageable pageable) {
        return invasionEventMapper.findExternalEventsByIsDealed(pageable,"是");
    }

    @Override
    public Page<InvasionEvent> findPageNotDealedEvent(Pageable pageable) {
        return invasionEventMapper.findExternalEventsByIsDealed(pageable,"");
    }


}
