package com.enjoy.dp.MyShiro.encrypt;

import com.enjoy.dp.MyShiro.config.Config;

public class EncryptContext {

    private PasswordEncrypt pe;

    public EncryptContext() {
        String cls = Config.get("encryptType","com.design.pattern.encrypt.Md5Encrypt");
        this.pe = EncryptFactory.create(cls);
    }

    public String encrypt(String password){
        return this.pe.encrypt(password);
    }

}
