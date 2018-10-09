package com.enjoy.dp.Singleton.example1;

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
        //创建读取应用配置的对象
        AppConfig config = new AppConfig();

        String paramA = config.getParameterA();
        String paramB = config.getParameterB();

        System.out.println("paramA="+paramA+",paramB="+paramB);
    }
}
