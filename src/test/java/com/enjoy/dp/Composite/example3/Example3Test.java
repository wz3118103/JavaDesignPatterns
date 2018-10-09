package com.enjoy.dp.Composite.example3;

import org.junit.Test;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 16:08 2018/10/9
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Example3Test {
    @Test
    public void example3Test() {
        RecursiveTest test = new RecursiveTest();
        int result = test.recursive(5);
        System.out.println("5的阶乘="+result);
    }
}
