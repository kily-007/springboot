package com.example.springboot.controller;

import com.example.springboot.bean.User;
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

    @GetMapping("/dataLoadManage")
    public String dataLoadManage(){
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
    public String userRightManage(){
        return "userRightManage";
    }


    @GetMapping("/systemUsersManage")
    public String selectSystemUsersList(String action, Model model,Integer page,Integer totalPage){
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
