package com.enjoy.dp.Observer.News.observers;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 7:27 2018/10/1
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class CustomerB extends Customer {
    @Override
    public void update() {
        System.out.println("我是客户B,我收到报纸啦");
    }
}
