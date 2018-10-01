package com.enjoy.dp.MyShiro.myEncrypt;

import com.enjoy.dp.MyShiro.encrypt.PasswordEncrypt;

public class MyEncrypt implements PasswordEncrypt {

    @Override
    public String encrypt(String password) {
        return password + " encrypted pwd";
    }

}
