package com.enjoy.dp.Builder.example3;

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
        //创建构建器
        ConcreteBuilder builder = new ConcreteBuilder("001",12345L,67890L);
        //设置需要的数据，然后构建保险合同对象
        InsuranceContract contract = builder.setPersonName("张三").setOtherData("test").build();
        //操作保险合同对象的方法
        contract.someOperation();
    }
}
