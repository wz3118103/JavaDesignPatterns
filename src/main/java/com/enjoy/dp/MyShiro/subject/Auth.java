package com.enjoy.dp.MyShiro.subject;

import com.enjoy.dp.MyShiro.auth.AuthToken;

public interface Auth {

    /**
     * 登录操作
     * @param token
     * @return
     */
    boolean login(AuthToken token);

    /**
     * 是否已登录
     * @return
     */
    boolean isLogin();

    /**
     * 是否有权限
     * @param permission
     * @return
     */
    boolean isPermitted(String permission);
}
