package com.enjoy.dp.AbstractFactory.example4;

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
        //创建DAO的抽象工厂
        DAOFactory df = new RdbDAOFactory();
        //通过抽象工厂来获取需要的DAO接口
        OrderMainDAO mainDAO = df.createOrderMainDAO();
        OrderDetailDAO detailDAO = df.createOrderDetailDAO();
        //调用DAO来完成数据存储的功能
        mainDAO.saveOrderMain();
        detailDAO.saveOrderDetail();
    }
}
