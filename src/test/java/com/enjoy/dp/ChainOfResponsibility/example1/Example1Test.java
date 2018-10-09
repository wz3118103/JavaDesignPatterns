package com.enjoy.dp.ChainOfResponsibility.example1;

import org.junit.Test;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 16:08 2018/10/9
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Example1Test {
    @Test
    public void example1Test() {
        FeeRequest request = new FeeRequest();

        //开始测试
        String ret1 = request.requestToProjectManager("小李", 300);
        System.out.println("the ret1="+ret1);
        String ret2 = request.requestToProjectManager("小张", 300);
        System.out.println("the ret2="+ret2);

        String ret3 = request.requestToProjectManager("小李", 600);
        System.out.println("the ret3="+ret3);
        String ret4 = request.requestToProjectManager("小张", 600);
        System.out.println("the ret4="+ret4);

        String ret5 = request.requestToProjectManager("小李", 1200);
        System.out.println("the ret5="+ret5);
        String ret6 = request.requestToProjectManager("小张", 1200);
        System.out.println("the ret6="+ret6);
    }
}
