package com.enjoy.dp.Iterator.example3;

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
        //访问集团的工资列表
        PayManager payManager= new PayManager();
        //先计算再获取
        payManager.calcPay();
        System.out.println("集团工资列表：");
        test(payManager.createIterator());

        //访问新收购公司的工资列表
        SalaryManager salaryManager = new SalaryManager();
        //先计算再获取
        salaryManager.calcSalary();
        System.out.println("新收购的公司工资列表：");
        test(salaryManager.createIterator());
    }

    /**
     * 测试通过访问聚合对象的迭代器，是否能正常访问聚合对象
     * @param it 聚合对象的迭代器
     */
    private static void test(Iterator it){
        //循环输出聚合对象中的值
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

}
