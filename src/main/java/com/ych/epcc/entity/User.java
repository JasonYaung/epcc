package com.ych.epcc.entity;

/**
 * @program: epcc
 * @description:
 * @author: yangchenhui
 * @create: 2022-03-23 14:35
 **/
public class User {


    private String bankCardNumber;
    private String phoneNumber;
    private String humanName;
    private String newDate;


    public String getBankCardNumber() {
        return bankCardNumber;
    }

    public void setBankCardNumber(String bankCardNumber) {
        this.bankCardNumber = bankCardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    public String getNewDate() {
        return newDate;
    }

    public void setNewDate(String newDate) {
        this.newDate = newDate;
    }
    @Override
    public String toString(){
        return "people{" +
                "Card:"+bankCardNumber+
                ",phone:"+phoneNumber+
                ",name:"+humanName+
                ",datetime"+newDate+"}";
    }
}
