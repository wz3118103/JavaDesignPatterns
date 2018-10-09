package com.enjoy.dp.AbstractFactory.example3;

import org.junit.Test;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 16:08 2018/10/9
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Example3Test {
    @Test
    public void example3Test() {
        //创建装机工程师对象
        ComputerEngineer engineer = new ComputerEngineer();
        //客户选择并创建需要使用的装机方案对象
        AbstractFactory schema = new Schema3();
        //告诉装机工程师自己选择的装机方案，让装机工程师组装电脑
        engineer.makeComputer(schema);
    }
}
