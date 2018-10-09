package com.enjoy.dp.FactoryMethod.example1;

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
        ExportOperate operate = new ExportOperate();
        operate.export(2, "测试数据");
    }
}
