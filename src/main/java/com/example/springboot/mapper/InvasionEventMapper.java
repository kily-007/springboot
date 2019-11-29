package com.example.springboot.mapper;

import com.example.springboot.bean.InvasionEvent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvasionEventMapper extends JpaRepository<InvasionEvent,String> {

    Page<InvasionEvent> findExternalEventsByInvasionType(Pageable pageable, String invasionType);

    Page<InvasionEvent> findExternalEventsByIsDealed(Pageable pageable, String isDealed);


}
