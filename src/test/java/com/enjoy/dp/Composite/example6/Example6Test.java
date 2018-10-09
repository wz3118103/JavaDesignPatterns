package com.enjoy.dp.Composite.example6;

import org.junit.Test;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 16:08 2018/10/9
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Example6Test {
    @Test
    public void example6Test() {
        //定义所有的组合对象
        Component root = new Composite("服装");
        Component c1 = new Composite("男装");
        Component c2= new Composite("衬衣");
        Component c3= new Composite("男装");
        //设置一个环状引用
        root.addChild(c1);
        c1.addChild(c2);
        c2.addChild(c3);

        //调用根对象的输出功能来输出整棵树
        root.printStruct("");
    }
}
