package com.ych.epcc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: epcc
 * @description:
 * @author: yangchenhui
 * @create: 2022-03-24 17:18
 **/

@Controller
@RequestMapping("/test")
public class PageController {

    @RequestMapping("/index")
    public String toPeople(){
        return "index";
    }
}
