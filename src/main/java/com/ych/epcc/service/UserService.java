package com.ych.epcc.service;

import com.ych.epcc.entity.User;
import com.ych.epcc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: epcc
 * @description:
 * @author: yangchenhui
 * @create: 2022-03-23 15:38
 **/

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;
    public User sel(String bankCardNumber){
        return userMapper.sel(bankCardNumber);

    }

    public User insert(String bankCardNumber,String phoneNumber,String humanName,String newDate){
        return userMapper.insert(bankCardNumber,phoneNumber,humanName,newDate);

    }
}
