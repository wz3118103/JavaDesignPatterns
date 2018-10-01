package com.enjoy.dp.MyShiro.auth;

public abstract class AuthRealm {

    private AuthRealm successor;

    public void setSuccessor(AuthRealm realm){
        this.successor = realm;
    }

    public final boolean auth(AuthToken token){

        if(token == null) return false;

        if(this.loginAuth(token)){
            return true;
        }
        return successor != null && successor.auth(token);
    }

    /**
     * 登录验证
     * @return
     */
    protected abstract boolean loginAuth(AuthToken token);

    /**
     * 权限验证
     * @return
     */
    protected abstract PermissionInfo doGetPermissionInfo(AuthToken token);
}
