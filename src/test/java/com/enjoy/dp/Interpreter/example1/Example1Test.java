package com.enjoy.dp.Interpreter.example1;

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
        ReadAppXml t = new ReadAppXml();
        try {
            t.read("src/main/resources/App2.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
