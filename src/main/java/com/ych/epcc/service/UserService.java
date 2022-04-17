package com.ych.epcc.service;

import com.ych.epcc.entity.User;
import com.ych.epcc.mapper.UserMapper;
import com.ych.epcc.redisutil.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.NOPLogger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.LogManager;

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

    @Autowired
    private RedisTemplate<String, String> redisTemplate;
    private RedisUtil redisUtil;
    private final Logger logger = LoggerFactory.getLogger(UserService.class);





    public boolean insert(String bankCardNumber,String phoneNumber,String humanName,String newDate){
       try {
           userMapper.insertPeople(bankCardNumber,phoneNumber,humanName,newDate);
           return true;
       }catch (Exception e){
           logger.debug(""+e);

       }
        return false;


    }

    public List<User> getAll() {
        return userMapper.getAll();
    }







    public String getRedis(String key) {

        return key;
    }
}
