package com.enjoy.dp.Strategy.example3;

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
    public void example3Test1() {
        //1：选择并创建需要使用的策略对象
        Strategy strategy = new LargeCustomerStrategy();
        //2：创建上下文
        Price ctx = new Price(strategy);

        //3：计算报价
        double quote = ctx.quote(1000);
        System.out.println("向客户报价："+quote);
    }

    @Test
    public void example3Test2() {
        //1：选择并创建需要使用的策略对象
        Strategy strategy = new CooperateCustomerStrategy();
        //2：创建上下文
        Price ctx = new Price(strategy);

        //3：计算报价
        double quote = ctx.quote(1000);
        System.out.println("向客户报价："+quote);
    }
}
