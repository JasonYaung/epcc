package com.ych.epcc.controller;

import com.ych.epcc.entity.User;
import com.ych.epcc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: epcc
 * @description:
 * @author: yangchenhui
 * @create: 2022-03-23 14:41
 **/

@RestController
@RequestMapping("test")
public class UserController {



    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{bankCardNumber}")
    public String getUser(@PathVariable String bankCardNumber){
        return userService.sel(bankCardNumber).toString();
    }

    @RequestMapping("getUser/{key}/{bankCardNumber}")
    public String getUser(@PathVariable String key, @PathVariable String bankCardNumber){
        return userService.sel(key,bankCardNumber);
    }

    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    public List<User> getAll(){
        return userService.getAll();
    }

    @RequestMapping("getRedis/{key}")
    public String getRedis(@PathVariable String key){
        return userService.getRedis(key);
    }

    @RequestMapping("setRedis/{key}/{value}")
    public String setRedis(@PathVariable String key, @PathVariable String value){
        return userService.setRedis(key,value);
    }
}
