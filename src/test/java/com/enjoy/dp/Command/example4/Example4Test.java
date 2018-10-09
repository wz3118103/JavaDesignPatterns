package com.enjoy.dp.Command.example4;

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
        //只是负责向服务员点菜就好了
        //创建服务员
        Waiter waiter = new Waiter();

        //创建命令对象，就是要点的菜
        Command chop = new ChopCommand();
        Command duck = new DuckCommand();
        Command pork = new PorkCommand();

        //点菜，就是把这些菜让服务员记录下来
        waiter.orderDish(chop);
        waiter.orderDish(duck);
        waiter.orderDish(pork);

        //点菜完毕
        waiter.orderOver();
    }
}
