package com.enjoy.dp.Strategy.Calculator;

import org.junit.Test;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 7:46 2018/9/30
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class CalculatorTest {
    @Test
    public void addTest(){
        Calculator calculator = new Calculator();
        calculator.setOperation(new OperationAdd());
        int result = calculator.doOperation(1,2);
        System.out.println(result);
    }
}
