package com.example.springboot.controller;

import com.example.springboot.bean.DataFile;
import com.example.springboot.bean.SubwayCount;
import com.example.springboot.bean.SubwayDataFile;
import com.example.springboot.service.DataManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DataManageController {

    @Autowired
    private DataManageService dataManageService;

    @GetMapping("/dataAllLineManage")
    public String showDataFileManage(Model model, Integer page, Integer totalPage){
        int pageLimit=13;
        if(page==null||page<=0)
            page=0;
        else if(page>=totalPage)
            page=totalPage-1;
        Pageable pageable = PageRequest.of(page, pageLimit, Sort.Direction.ASC, "id");
        Page<DataFile> dataFilePage = dataManageService.findPageDataFile(pageable);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", dataFilePage.getTotalPages());
        model.addAttribute("limitPage", pageLimit);
        model .addAttribute("dataFiles", dataFilePage.getContent());
        model.addAttribute("totalCount", dataFilePage.getTotalElements());
        return "dataAllLineManage";
    }

    @GetMapping("/dataSubwayManage")
    public String showDataSubwayManage(Model model, Integer page, Integer totalPage){
        int pageLimit=15;
        if(page==null||page<=0)
            page=0;
        else if(page>=totalPage)
            page=totalPage-1;
        Pageable pageable = PageRequest.of(page, pageLimit, Sort.Direction.ASC, "id");
        Page<SubwayDataFile> dataFilePage = dataManageService.findPageSubwayDataFile(pageable);
        model.addAttribute("currentPage", page);
        model.addAttribute("subwayDataFiles", dataFilePage.getContent());
        model.addAttribute("totalPages", dataFilePage.getTotalPages());
        model.addAttribute("limitPage", pageLimit);
        model.addAttribute("totalCount", dataFilePage.getTotalElements());

        return "dataSubwayManage";
    }


    /**
     * 列车历史统计
     * @param model
     * @param page
     * @param totalPage
     * @return 表格数据
     */
    @GetMapping("/subwayHistory")
    public String showDataSubwayHistory(Model model, Integer page, Integer totalPage){
        int pageLimit=5;
        if(page==null||page<=0)
            page=0;
        else if(page>=totalPage)
            page=totalPage-1;
        Pageable pageable = PageRequest.of(page, pageLimit, Sort.Direction.ASC, "id");
        Page<SubwayCount> subwayCountPage = dataManageService.findPageSubwayCount(pageable);
        model.addAttribute("currentPage", page);
        model.addAttribute("limitPage", pageLimit);
        model.addAttribute("subwayCounts", subwayCountPage.getContent());
        model.addAttribute("totalPages", subwayCountPage.getTotalPages());
        model.addAttribute("totalCount", subwayCountPage.getTotalElements());
        return "subwayHistory";
    }


}
