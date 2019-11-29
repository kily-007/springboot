package com.example.springboot.controller;

import com.example.springboot.bean.DampingFile;
import com.example.springboot.service.DampingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DampingAnalysisController {

    @Autowired
    private DampingService dampingService;

    @GetMapping("/dampingAnalysis")
    public String showDampingAnalysis(){
        return "dampingAnalysis";
    }

    @GetMapping("/dampingAnalysisHistory")
    public String showDampingAnalysis(Model model, Integer page, Integer totalPage){
        int pageLimit=10;
        if(page==null||page<=0)
            page=0;
        else if(page>=totalPage)
            page=totalPage-1;
        Pageable pageable = PageRequest.of(page, pageLimit, Sort.Direction.ASC, "id");
        Page<DampingFile> dampingFilesPage = dampingService.findPageDampingFile(pageable);
        model.addAttribute("currentPage", page);
        model.addAttribute("limitPage", pageLimit);
        model.addAttribute("totalPages", dampingFilesPage.getTotalPages());
        model .addAttribute("dampingFiles", dampingFilesPage.getContent());
        model.addAttribute("totalCount", dampingFilesPage.getTotalElements());
        return "dampingAnalysisHistory";
    }

}
