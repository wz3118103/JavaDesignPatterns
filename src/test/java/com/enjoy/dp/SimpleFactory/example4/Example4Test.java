package com.enjoy.dp.SimpleFactory.example4;

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
        //重要改变，没有new Impl()了，取而代之Factory.createApi()
        //注意这里传递的参数，修改参数就可以修改行为，试试看吧
        Api api = Factory.createApi(2);
        api.test1("哈哈，不要紧张，只是个测试而已！");
    }
}
