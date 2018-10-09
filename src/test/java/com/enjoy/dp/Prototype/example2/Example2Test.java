package com.enjoy.dp.Prototype.example2;

import org.junit.Test;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 16:08 2018/10/9
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Example2Test {
    @Test
    public void example2Test() {
        //创建订单对象，这里为了演示简单，直接new了
        PersonalOrder op = new PersonalOrder();
        //设置订单数据
        op.setOrderProductNum(3925);
        op.setCustomerName("张三");
        op.setProductId("P0001");

        //这里获取业务处理的类，也直接new了，为了简单，连业务接口都没有做
        OrderBusiness ob = new OrderBusiness();
        //调用业务来保存订单对象
        ob.saveOrder(op);
    }
}
