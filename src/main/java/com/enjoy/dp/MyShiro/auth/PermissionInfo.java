package com.enjoy.dp.MyShiro.auth;

import java.util.Set;

public class PermissionInfo {

    private Set<String> permissions;
    private Set<String> roles;

    public Set<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<String> permissions) {
        this.permissions = permissions;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    /**
     * 判断是否有某权限
     * @param permission
     * @return
     */
    public boolean isPermitted(String permission){
        return this.permissions.contains(permission);
    }

}
