package com.enjoy.dp.MyShiro.subject;

import com.enjoy.dp.MyShiro.auth.AuthToken;
import com.enjoy.dp.MyShiro.auth.PermissionInfo;
import com.enjoy.dp.MyShiro.auth.AuthManager;
import com.enjoy.dp.MyShiro.encrypt.EncryptContext;

/**
 * 登录用户主体
 */
public class Subject implements Auth{

    private AuthToken token;

    @Override
    public boolean login(AuthToken token) {

        String password = (new EncryptContext()).encrypt(token.getPassword());
        token.setPassword(password);

        if(AuthManager.getInstance().auth(token)){
            System.out.println("登录成功");
            this.token = token;
            return true;
        }
        return false;
    }

    @Override
    public boolean isLogin() {
        return token != null;
    }

    @Override
    public boolean isPermitted(String permission) {
        PermissionInfo info =  AuthManager.getInstance().getPermissionInfo(this.token);
        return info != null && info.isPermitted(permission);
    }

    public String getUsername(){
        return token.getUsername();
    }
}
