package com.example.springboot.controller;

import com.example.springboot.bean.DataLoad;
import com.example.springboot.bean.User;
import com.example.springboot.bean.UserRight;
import com.example.springboot.service.SystemManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SystemManageController {

    @Autowired
    private SystemManageService systemManageService;

//    private int tpage=0;
//    private int tlimit=10;
//
//    @GetMapping("/dataLoad")
//    public String showIndex(@RequestParam(required = false,defaultValue = "0")int page,
//                            @RequestParam(required = false,defaultValue = "10")int limit){
//        tpage=page;
//        tlimit=limit;
//        return "dataLoadManage";
//    }
//    @GetMapping("/dataLoadManage")
//    @ResponseBody
//    public LayuiTableResult dataLoadManage(){
//
//        Pageable pageable = PageRequest.of(tpage, tlimit, Sort.Direction.ASC, "id");
//        Page<DataLoad> dataPage = systemManageService.findPageDataLoad(pageable);
//        return new LayuiTableResult(0,"123456",dataPage.getTotalPages(),dataPage.getContent());
//    }


    @GetMapping("/dataLoadManage")
    public String showDataLoadManage(Model model,Integer page,Integer totalPage){
        int pageLimit=10;
        if(page==null||page<=0)
            page=0;
        else if(page>=totalPage)
            page=totalPage-1;
        Pageable pageable = PageRequest.of(page, pageLimit, Sort.Direction.ASC, "id");
        Page<DataLoad> dataLoadPage = systemManageService.findPageDataLoad(pageable);
        model.addAttribute("dataLoads", dataLoadPage.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", dataLoadPage.getTotalPages());
        model.addAttribute("limitPage", pageLimit);
        model.addAttribute("totalCount", dataLoadPage.getTotalElements());
        return "dataLoadManage";
    }

    @GetMapping("/securitySetting")
    public String securitySetting(){
        return "securitySetting";
    }

    @GetMapping("/userInfoManage")
    public String userInfoManage(){
        return "userInfoManage";
    }

    @GetMapping("/userRightManage")
    public String userRightManage(Model model,Integer page,Integer totalPage){
        int pageLimit=10;
        if(page==null||page<=0)
            page=0;
        else if(page>=totalPage)
            page=totalPage-1;
        Pageable pageable = PageRequest.of(page, pageLimit, Sort.Direction.ASC, "id");
        Page<UserRight> usersRightPage = systemManageService.findPageUserRight(pageable);
        model.addAttribute("userRights", usersRightPage.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", usersRightPage.getTotalPages());
        model.addAttribute("limitPage", pageLimit);
        model.addAttribute("totalCount", usersRightPage.getTotalElements());
        return "userRightManage";
    }

    @GetMapping("/systemUsersManage")
    public String selectSystemUsersList(Model model,Integer page,Integer totalPage){
        int pageLimit=10;
        if(page==null||page<=0)
            page=0;
        else if(page>=totalPage)
            page=totalPage-1;
        Pageable pageable = PageRequest.of(page, pageLimit, Sort.Direction.ASC, "id");
        Page<User> usersPage = systemManageService.findAllSystemUsers(pageable);
        model.addAttribute("users", usersPage.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", usersPage.getTotalPages());
        model.addAttribute("limitPage", pageLimit);
        model.addAttribute("totalCount", usersPage.getTotalElements());
        return "systemUsersManage";
    }

}