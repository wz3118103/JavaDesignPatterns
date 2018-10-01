package com.enjoy.dp.MyShiro.auth;

import java.util.ArrayList;
import java.util.List;
import com.enjoy.dp.MyShiro.config.Config;

public class AuthManager {

    private List<AuthRealm> list = new ArrayList<>();

    private static AuthManager instance = new AuthManager();

    /**
     * 私有构造方法，读取配置文件，通过反射机制生成Realm，并构建责任链
     */
    private AuthManager() {

        String realms = Config.get("realms");

        if(realms == null || realms.isEmpty()){
            throw new RuntimeException("请定义Realm");
        }

        String[] clss = realms.split(",");
        for (int i = 0;i < clss.length; i++){
            try {
                Object obj = Class.forName(clss[i]).newInstance();
                if(obj instanceof AuthRealm){
                    this.list.add((AuthRealm)obj);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i=0;i<list.size()-1;i++){
            AuthRealm next = list.get(i+1);
            if(next != null){
                list.get(i).setSuccessor(next);
            }
        }

    }

    /**
     * 调用realm中的doGetPermissionInfo方法，如果有多个realm，只调用第一个
     * @param token
     * @return
     */
    public PermissionInfo getPermissionInfo(AuthToken token){
        if(token == null){
            return null;
        }
        if(list.size() > 0){
            return this.list.get(0).doGetPermissionInfo(token);
        }
        return null;
    }

    /**
     * 登录认证，调用realm责任链
     * @return
     */
    public boolean auth(AuthToken token){
        if(list.size() == 0){
            return false;
        }
        return list.get(0).auth(token);
    }


    /**
     * 单例
     * @return
     */
    public static AuthManager getInstance(){
        return instance;
    }


}
