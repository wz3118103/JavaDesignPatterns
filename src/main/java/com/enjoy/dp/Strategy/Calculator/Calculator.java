package com.enjoy.dp.Strategy.Calculator;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 7:46 2018/9/30
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Calculator {
    private Operation operation;

    public void setOperation(Operation operation){
        this.operation = operation;
    }

    public int doOperation(int num1, int num2){
        return this.operation.doOperation(num1,num2);
    }
}
