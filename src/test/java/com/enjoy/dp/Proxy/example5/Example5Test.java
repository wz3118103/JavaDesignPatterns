package com.enjoy.dp.Proxy.example5;

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
        //张三先登录系统创建了一个订单
        Order order = new OrderProxy("设计模式",100,"张三");
        //李四想要来修改，那就会报错
        order.setOrderNum(123, "李四");
        //输出order
        System.out.println("李四修改后订单记录没有变化："+order);
        //张三修改就不会有问题
        order.setOrderNum(123, "张三");
        //再次输出order
        System.out.println("张三修改后，订单记录："+order);
    }
}
