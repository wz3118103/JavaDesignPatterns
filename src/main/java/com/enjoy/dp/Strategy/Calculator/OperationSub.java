package com.enjoy.dp.Strategy.Calculator;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 7:45 2018/9/30
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class OperationSub implements Operation {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}