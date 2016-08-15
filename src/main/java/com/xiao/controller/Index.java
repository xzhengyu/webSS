/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-06-06 20:07 创建
 *
 */
package com.xiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * User:  肖正宇
 * Date:  2016/8/4
 * Email: xzhengyu2425@foxmail.com
 */

@Controller
public class Index {

    @RequestMapping("/index")
    public String ss(HttpServletRequest request){
        HttpSession session = request.getSession();
        request.setAttribute("qqq","测试");
        System.out.println(request.getAttribute("qqq"));
        return "index";
    }
}
