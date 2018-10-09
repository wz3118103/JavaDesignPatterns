package com.enjoy.dp.ChainOfResponsibility.example5;

import org.junit.Test;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 16:08 2018/10/9
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Example5Test {
    @Test
    public void example5Test() {
        //创建业务对象
        GoodsSaleEbo ebo = new GoodsSaleEbo();
        //准备测试数据
        SaleModel saleModel = new SaleModel();
        saleModel.setGoods("张学友怀旧经典");
        saleModel.setSaleNum(10);

        //调用业务功能
        ebo.sale("小李", "张三", saleModel);
        ebo.sale("小张", "李四", saleModel);
    }
}
