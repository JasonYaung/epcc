package com.ych.epcc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @program: epcc
 * @description:
 * @author: yangchenhui
 * @create: 2022-03-23 14:35
 **/

@Data
@AllArgsConstructor
public class User {

    @Id
    private String bankCardNumber;

    private String phoneNumber;

    private String humanName;

    private String newDate;




}
