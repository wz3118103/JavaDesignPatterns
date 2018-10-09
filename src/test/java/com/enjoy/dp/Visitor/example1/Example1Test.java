package com.enjoy.dp.Visitor.example1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

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
        //准备点测试数据
        Collection<Customer> colCustomer = preparedTestData();
        //循环对客户进行操作
        for(Customer cm : colCustomer){
            //进行偏好分析
            cm.predilectionAnalyze();
            //进行价值分析
            cm.worthAnalyze();
        }
    }
    private static Collection<Customer> preparedTestData(){
        Collection<Customer> colCustomer = new ArrayList<Customer>();
        //为了测试方便，准备点数据
        Customer cm1 = new EnterpriseCustomer();
        cm1.setName("ABC集团");
        colCustomer.add(cm1);

        Customer cm2 = new EnterpriseCustomer();
        cm2.setName("CDE公司");
        colCustomer.add(cm2);

        Customer cm3 = new PersonalCustomer();
        cm3.setName("张三");
        colCustomer.add(cm3);

        return colCustomer;
    }
}
