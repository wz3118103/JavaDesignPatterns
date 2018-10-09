package com.enjoy.dp.SimpleFactory.example1;

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
        Api api = new Impl();
        api.test1("哈哈，不要紧张，只是个测试而已！");
    }
}
