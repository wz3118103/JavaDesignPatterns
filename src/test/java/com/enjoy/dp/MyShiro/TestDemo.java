package com.enjoy.dp.MyShiro;

import com.enjoy.dp.MyShiro.auth.AuthToken;
import com.enjoy.dp.MyShiro.encrypt.EncryptContext;
import com.enjoy.dp.MyShiro.subject.Subject;
import com.enjoy.dp.MyShiro.util.SecurityUtils;
import org.junit.Test;

import java.io.IOException;

public class TestDemo {

    @Test
    public void defaultEncryptTest() {
        String encryptedPwd = (new EncryptContext()).encrypt("123");
        System.out.println("加密后："+encryptedPwd);
    }

    @Test
    public  void wholeTest() throws IOException{

        String encryptedPwd = (new EncryptContext()).encrypt("123");
        System.out.println("加密后："+encryptedPwd);

        Subject currentUser = SecurityUtils.getSubject();

        System.out.println("是否已登录："+currentUser.isLogin());

        currentUser.login(new AuthToken("admin","123"));

        System.out.println("是否已登录："+currentUser.isLogin());

        System.out.println("是否有权限："+currentUser.isPermitted("permission1"));
    }
}
