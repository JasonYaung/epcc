package com.ych.epcc.service;

import com.ych.epcc.entity.User;
import com.ych.epcc.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

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

    private static Logger logger = LoggerFactory.getLogger(UserService.class);

    public User sel(String bankCardNumber) {

        return userMapper.sel(bankCardNumber);
    }


    public String sel(String key, String bankCardNumber){
        String  result = "";

        try{

            result = redisTemplate.opsForValue().get(key);
            logger.debug("value:"+result);
        }catch (Exception e){
            logger.debug("访问redis错误：",e);
        }
        if(result == null||result.equals("")){
            System.out.println("查无此key！");
            return "查无此key";
        }else if(!(result).equals(bankCardNumber)){
            logger.debug("card:"+bankCardNumber);
            return userMapper.sel(bankCardNumber).getHumanName();

        }
        return result;



    }

    public User insert(String bankCardNumber,String phoneNumber,String humanName,String newDate){
        return userMapper.insert(bankCardNumber,phoneNumber,humanName,newDate);

    }

    public List<User> getAll() {
        return userMapper.getAll();
    }



    public  String getRedis(String key) {

        String  result = "";

        try{
             result = redisTemplate.opsForValue().get(key);
        }catch (Exception e){
           logger.error("访问redis错误：",e);
        }
        if(result == null||result.equals("")){
            System.out.println("查无此key！");
            return "查无此key";
        }else {
            return result;
        }

    }

    public String setRedis(String key,String value) {
        try{
            redisTemplate.opsForValue().set(key,value);
        }catch (Exception e){
            logger.error("写入错误",e);
        }
        return "写入成功";



    }
}
