package com.enjoy.dp.simplefactory.example5;

import org.junit.Test;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 16:08 2018/10/9
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Example5Test {
    @Test
    public void example5Test() {
        //重要改变，没有new Impl()了，取而代之Factory.createApi()
        Api api = Factory.createApi();
        api.test1("哈哈，不要紧张，只是个测试而已！");
    }

    @Test
    public void example5MyTest() {
        //重要改变，没有new Impl()了，取而代之Factory.createApi()
        Api api = MyFactory.createApi();
        api.test1("哈哈，不要紧张，只是个测试而已！");
    }
}
