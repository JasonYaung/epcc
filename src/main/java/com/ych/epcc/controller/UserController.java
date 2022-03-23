package com.ych.epcc.controller;

import com.ych.epcc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: epcc
 * @description:
 * @author: yangchenhui
 * @create: 2022-03-23 14:41
 **/

@RestController
@RequestMapping("/testBoot")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{bankCardNumber}")
    public String  GetUser(@PathVariable String bankCardNumber){
        return userService.sel(bankCardNumber).toString();
    }
}
