package com.example.rajat.firebasedemo;

/**
 * Created by rajat on 10/26/2017.
 */
public class UserInformation {
    private String name;
    private String email;
    private String phone_num;

    public UserInformation(){

    }

    public UserInformation(String email, String name, String phone_num) {
        this.email = email;
        this.name = name;
        this.phone_num = phone_num;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }
}

