package com.enjoy.dp.Decorator.Clothes;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 6:32 2018/10/1
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class LaoWang implements Person {

    @Override
    public Double cost() {
        return 0.0; //赤果果的时候累计消费为0
    }

    @Override
    public void show() {
        System.out.println("我是赤果果的老王");
    }
}
