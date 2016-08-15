package com.xiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * User:  肖正宇
 * Date:  2016/8/11
 * Email: xzhengyu2425@foxmail.com
 */
@Controller
public class StockPhoto {

    @RequestMapping(value = "/index/stock" )
    public ModelAndView showStock(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "ertytr");
        modelAndView.setViewName("stock");

        return  modelAndView;
    }

}
