package com.xiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

/**
 * User:  肖正宇
 * Date:  2016/8/11
 * Email: xzhengyu2425@foxmail.com
 */
@Controller
public class AboutUs {

    @RequestMapping(value = "/index/adout" , method = RequestMethod.GET)
    public ModelAndView showAbout(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "ertytr");
        modelAndView.setViewName("about");
        return  modelAndView;
    }
}
