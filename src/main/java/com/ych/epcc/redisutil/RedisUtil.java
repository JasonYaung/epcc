package com.ych.epcc.redisutil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @ClassName RedisUtil
 * @Descrintion Redis操作
 * @Author jason
 * @Date 2022/4/15 15:09
 * @Version 1.0
 **/
public class RedisUtil {

        @Autowired
        private RedisTemplate<String, String> redisTemplate;


        /*
        * 获取redis中的值
        * */

        public String getValuesFromRedis(String keys){
                String result = "";

                try{
                        result = redisTemplate.opsForValue().get(keys);
                }catch (Exception e){
                        throw e;
                }
                return  result;

        }
}
