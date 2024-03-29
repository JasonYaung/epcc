package com.ych.epcc.mapper;

import com.ych.epcc.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

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
     * 根据卡号查询
     * @param bankCardNumber
     * @return
     */
    User getUser(String bankCardNumber);

    /**
     * 查询全部
     * @param
     * @return
     */
    List<User> getAll();


    /**
     * 插入数据
     * @param bankCardNumber
     * @param phoneNumber
     * @param humanName
     * @param newDate
     */
    void insertPeople(String bankCardNumber, String phoneNumber, String humanName, String newDate);

}


