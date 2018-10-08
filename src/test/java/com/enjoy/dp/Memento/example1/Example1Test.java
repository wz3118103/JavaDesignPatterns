package com.enjoy.dp.Memento.example1;

import org.junit.Test;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 21:39 2018/10/8
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Example1Test {
    @Test
    public void example1Test() {
        // 创建模拟运行流程的对象
        FlowAMock mock = new FlowAMock("TestFlow");
        //运行流程的第一个阶段
        mock.runPhaseOne();
        //得到第一个阶段运行所产生的数据，后面要用
        int tempResult = mock.getTempResult();
        String tempState = mock.getTempState();

        //按照方案一来运行流程后半部分
        mock.schema1();

        //把第一个阶段运行所产生的数据重新设置回去
        mock.setTempResult(tempResult);
        mock.setTempState(tempState);

        //按照方案二来运行流程后半部分
        mock.schema2();
    }
}
