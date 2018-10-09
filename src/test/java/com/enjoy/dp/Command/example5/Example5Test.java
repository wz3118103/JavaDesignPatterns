package com.enjoy.dp.Command.example5;

import org.junit.Test;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 16:08 2018/10/9
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Example5Test {
    //@Test
   // public void example5Test() {
    public static void main(String[] args) {
        //先要启动后台，让整个程序运行起来
        CookManager.runCookManager();

        //为了简单，直接用循环模拟多个桌号点菜
        for(int i = 0;i<5;i++){
            //创建服务员
            Waiter waiter = new Waiter();
            //创建命令对象，就是要点的菜
            Command chop = new ChopCommand(i);
            Command duck = new DuckCommand(i);
            //点菜，就是把这些菜让服务员记录下来
            waiter.orderDish(chop);
            waiter.orderDish(duck);
            //点菜完毕
            waiter.orderOver();
        }
    }
}
