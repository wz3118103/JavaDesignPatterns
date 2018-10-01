package com.enjoy.dp.Observer.News.observers;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 8:09 2018/10/1
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class CustomerC implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("我是客户C，我收到消息啦");
    }
}
