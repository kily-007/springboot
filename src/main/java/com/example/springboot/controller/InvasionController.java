package com.example.springboot.controller;

import com.example.springboot.bean.InvasionEvent;
import com.example.springboot.service.InvasionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvasionController {

    @Autowired
    private InvasionService invasionService;

    @GetMapping("/invasionHistory")
    public String showInvasionHistory(Model model, Integer page, Integer totalPage){
        int pageLimit=8;
        if(page==null||page<=0)
            page=0;
        else if(page>=totalPage)
            page=totalPage-1;
        Pageable pageable = PageRequest.of(page, pageLimit, Sort.Direction.ASC, "id");
        Page<InvasionEvent> invasionHistory = invasionService.findPageInvasionHistory(pageable);
        model.addAttribute("invasionHistorys", invasionHistory.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("limitPage", pageLimit);
        model.addAttribute("totalPages", invasionHistory.getTotalPages());
        model.addAttribute("totalCount", invasionHistory.getTotalElements());
        return "InvasionHistory";
    }


    @GetMapping("/internalInvasion")
    public String showInternalInvasion(Model model, Integer page, Integer totalPage){
        int pageLimit=6;
        if(page==null||page<=0)
            page=0;
        else if(page>=totalPage)
            page=totalPage-1;
        Pageable pageable = PageRequest.of(page, pageLimit, Sort.Direction.ASC, "id");
        Page<InvasionEvent> internalEvent = invasionService.findPageInternalEvent(pageable);
        model.addAttribute("internalEvents", internalEvent.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("limitPage", pageLimit);
        model.addAttribute("totalPages", internalEvent.getTotalPages());
        model.addAttribute("totalCount", internalEvent.getTotalElements());
        return "internalInvasion";
    }

    @GetMapping("/externalInvasion")
    public String showExternalInvasion(Model model, Integer page, Integer totalPage){
        int pageLimit=6;
        if(page==null||page<=0)
            page=0;
        else if(page>=totalPage)
            page=totalPage-1;
        Pageable pageable = PageRequest.of(page, pageLimit, Sort.Direction.ASC, "id");
        Page<InvasionEvent> externalEvent = invasionService.findPageExternalEvent(pageable);
        model.addAttribute("externalEvents", externalEvent.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("limitPage", pageLimit);
        model.addAttribute("totalPages", externalEvent.getTotalPages());
        model.addAttribute("totalCount", externalEvent.getTotalElements());
        return "externalInvasion";
    }

}
