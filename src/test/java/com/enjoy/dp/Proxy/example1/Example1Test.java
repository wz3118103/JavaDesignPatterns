package com.enjoy.dp.Proxy.example1;

import org.junit.Test;

import java.util.Collection;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 16:08 2018/10/9
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Example1Test {
    @Test
    public void example1Test() {
        UserManager userManager = new UserManager();
        Collection<UserModel> col = null;
        try {
            col = userManager.getUserByDepId("0101");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(col);
    }
}
