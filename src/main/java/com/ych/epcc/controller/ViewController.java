package com.ych.epcc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName ViewController
 * @Descrintion
 * @Author jason
 * @Date 2022/4/16 22:33
 * @Version 1.0
 **/


@Controller
public class ViewController {


 @GetMapping("/index")
 public String index(){
  return "index";
 }

}
