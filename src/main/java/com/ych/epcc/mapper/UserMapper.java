package com.ych.epcc.mapper;

import com.ych.epcc.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @program: epcc
 * @description:
 * @author: yangchenhui
 * @create: 2022-03-23 15:37
 **/
@Mapper
@Repository
public interface UserMapper {
    /**
     *
     * @param bankCardNumber
     * @return asdasd
     *
     */
    User sel(String bankCardNumber);
    User insert(String bankCardNumber,String phoneNumber,String humanName,String newDate);

}


