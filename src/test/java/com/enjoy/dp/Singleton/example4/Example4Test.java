package com.enjoy.dp.Singleton.example4;

import org.junit.Test;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 16:08 2018/10/9
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Example4Test {
    @Test
    public void example4Test() {
        //创建读取应用配置的对象
        AppConfig config = AppConfig.getInstance();

        String paramA = config.getParameterA();
        String paramB = config.getParameterB();

        System.out.println("paramA="+paramA+",paramB="+paramB);
    }
}
