package com.enjoy.dp.Bridge.example1;

import org.junit.Test;

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
        Message m = new CommonMessageSMS();
        m.send("aa", "au");

        m = new CommonMessageEmail();
        m.send("aa", "au");
    }

}
