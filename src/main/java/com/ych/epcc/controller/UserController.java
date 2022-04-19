package com.ych.epcc.controller;

import com.ych.epcc.entity.User;
import com.ych.epcc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @program: epcc
 * @description:
 * @author: yangchenhui
 * @create: 2022-03-23 14:41
 **/

@RestController
public class UserController {



    @Autowired
    private UserService userService;

    @RequestMapping(value = "getUser",method = RequestMethod.GET)
    public User getUser(@RequestParam("bankCardNumber") String bankCardNumber)  {
        return userService.getUser(bankCardNumber);
    }



    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    public List<User> getAll(){
        return userService.getAll();
    }

    @RequestMapping("getRedis")
    public String getRedis(@PathVariable String key){
        return userService.getRedis(key);
    }




    /**
     * 更新数据库
     * @return boolean
     */
    @RequestMapping(value = "setPeople",method = RequestMethod.POST)
    public boolean setPeople(@RequestBody User user){

        return userService.insert(user.getBankCardNumber(),user.getPhoneNumber(),user.getHumanName(),user.getNewDate());

    }

}
