package com.enjoy.dp.Strategy.example4;

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
        //创建相应的支付策略
        PaymentStrategy strategyRMB = new RMBCash();
        PaymentStrategy strategyDollar = new DollarCash();

        //准备小李的支付工资上下文
        PaymentContext ctx1 = new PaymentContext("小李",5000,strategyRMB);
        //向小李支付工资
        ctx1.payNow();

        //切换一个人，给petter支付工资
        PaymentContext ctx2 = new PaymentContext("Petter",8000,strategyDollar);
        ctx2.payNow();

        //测试新添加的支付方式
        PaymentStrategy strategyCard = new Card();
        PaymentContext ctx3 = new PaymentContext2("小王",9000,"010998877656",strategyCard);
        ctx3.payNow();

        //测试新添加的支付方式
        PaymentStrategy strategyCard2 = new Card2("010998877656");
        PaymentContext ctx4 = new PaymentContext("小张",9000,strategyCard2);
        ctx4.payNow();
    }
}
