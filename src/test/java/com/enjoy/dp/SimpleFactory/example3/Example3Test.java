package com.enjoy.dp.SimpleFactory.example3;

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
        //重要改变，没有new Impl()了，取而代之Factory.createApi()
        Api api = Factory.createApi();
        api.test1("哈哈，不要紧张，只是个测试而已！");
    }
}
