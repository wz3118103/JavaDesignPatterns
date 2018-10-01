package com.enjoy.dp.MyShiro.encrypt;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Encrypt implements PasswordEncrypt {

    @Override
    public String encrypt(String password) {
        MessageDigest md5 = null;

        try {
            md5 = MessageDigest.getInstance("MD5");
            md5.update(password.getBytes());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return new BigInteger(1,md5.digest()).toString(16);
    }

}
