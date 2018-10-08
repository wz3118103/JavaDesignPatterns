package com.enjoy.dp.Flyweight.example1;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 20:31 2018/10/8
 * @Description :描述授权数据的数据model
 * @Modified By   :
 * @Version :
 */

public class AuthorizationModel {
    /**
     * 人员
     */
    private String user;
    /**
     * 安全实体
     */
    private String securityEntity;
    /**
     * 权限
     */
    private String permit;

    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getSecurityEntity() {
        return securityEntity;
    }
    public void setSecurityEntity(String securityEntity) {
        this.securityEntity = securityEntity;
    }
    public String getPermit() {
        return permit;
    }
    public void setPermit(String permit) {
        this.permit = permit;
    }
}
