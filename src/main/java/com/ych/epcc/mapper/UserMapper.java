package com.ych.epcc.mapper;

import com.ych.epcc.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @program: epcc
 * @description:
 * @author: yangchenhui
 * @create: 2022-03-23 15:37
 **/

@Repository
public interface UserMapper {
    User selPeopleByCardNuM(String bankCardNumber);
    User insert(String bankCardNumber,String phoneNumber,String humanName,String newDate);

}


