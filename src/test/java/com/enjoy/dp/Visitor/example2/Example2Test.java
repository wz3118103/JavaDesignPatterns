package com.enjoy.dp.Visitor.example2;

import org.junit.Test;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 16:08 2018/10/9
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Example2Test {
    @Test
    public void example2Test() {
        //创建ObjectStructure
        ObjectStructure os = new ObjectStructure();
        //创建要加入对象结构的元素
        Element eleA = new ConcreteElementA();
        Element eleB = new ConcreteElementB();
        //把元素加入对象结构
        os.addElement(eleA);
        os.addElement(eleB);

        //创建访问者
        Visitor visitor = new ConcreteVisitor1();

        //调用业务处理的方法
        os.handleRequest(visitor);
    }
}
