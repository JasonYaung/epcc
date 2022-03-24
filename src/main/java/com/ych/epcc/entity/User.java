package com.ych.epcc.entity;

import lombok.Data;

/**
 * @program: epcc
 * @description:
 * @author: yangchenhui
 * @create: 2022-03-23 14:35
 **/

@Data
public class User {


    private String bankCardNumber;

    private String phoneNumber;

    private String humanName;

    private String newDate;



    @Override
    public String toString(){
        return "people{" +
                "Card:"+bankCardNumber+
                ",phone:"+phoneNumber+
                ",name:"+humanName+
                ",datetime"+newDate+"}";
    }
}
