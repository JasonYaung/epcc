package com.ych.epcc.entity;

/**
 * @program: epcc
 * @description:
 * @author: yangchenhui
 * @create: 2022-03-23 14:35
 **/
public class User {


    private String BankCardNumer;
    private String PhoneNumber;
    private String HumanName;
    private String NewDate;

    public String getBankCardNumer() {
        return BankCardNumer;
    }

    public void setBankCardNumer(String bankCardNumer) {
        BankCardNumer = bankCardNumer;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getHumanName() {
        return HumanName;
    }

    public void setHumanName(String humanName) {
        HumanName = humanName;
    }

    public String getNewDate() {
        return NewDate;
    }

    public void setNewDate(String newDate) {
        NewDate = newDate;
    }
}
