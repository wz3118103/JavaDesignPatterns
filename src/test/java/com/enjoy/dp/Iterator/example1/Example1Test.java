package com.enjoy.dp.Iterator.example1;

import org.junit.Test;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 16:08 2018/10/9
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Example1Test {
    /**
     * 示意方法，使用迭代器的功能。
     * 这里示意使用迭代器来迭代聚合对象
     */
    public static void someOperation(){
        String[] names = {"张三","李四","王五"};
        //创建聚合对象
        Aggregate aggregate = new ConcreteAggregate(names);
        //循环输出聚合对象中的值
        Iterator it = aggregate.createIterator();
        //首先设置迭代器到第一个元素
        it.first();
        while(!it.isDone()){
            //取出当前的元素来
            Object obj = it.currentItem();
            System.out.println("the obj=="+obj);
            //如果还没有迭代到最后，那么就向下迭代一个
            it.next();
        }
    }

    @Test
    public void example1Test() {

        //可以简单的测试一下
        someOperation();
    }
}
