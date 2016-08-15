package com.xiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * User:  肖正宇
 * Date:  2016/8/11
 * Email: xzhengyu2425@foxmail.com
 */
@Controller
public class User {

    @RequestMapping(value = "/index/register", method = RequestMethod.GET)
    public ModelAndView showAbout() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "ertytr");
        modelAndView.setViewName("register");

        return modelAndView;
    }

    @RequestMapping(value = "/index/single", method = RequestMethod.GET)
    public ModelAndView showSingle() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "ertytr");
        modelAndView.setViewName("single");

        return modelAndView;
    }
}