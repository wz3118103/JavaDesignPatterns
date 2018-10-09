package com.enjoy.dp.Proxy.example2;

import org.junit.Test;

import java.util.Collection;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 16:08 2018/10/9
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Example2Test {
    @Test
    public void example2Test() {
        UserManager userManager = new UserManager();
        Collection<UserModelApi> col = null;
        try {
            col = userManager.getUserByDepId("0101");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //如果只是显示用户名称，那么不需要重新查询数据库
        for(UserModelApi umApi : col){
            System.out.println("用户编号：="+umApi.getUserId()+",用户姓名：="+umApi.getName());
        }
        //如果访问非用户编号和用户姓名外的属性，那就会重新查询数据库
        for(UserModelApi umApi : col){
            System.out.println("用户编号：="+umApi.getUserId()+",用户姓名：="+umApi.getName()+",所属部门：="+umApi.getDepId());
        }
    }
}
