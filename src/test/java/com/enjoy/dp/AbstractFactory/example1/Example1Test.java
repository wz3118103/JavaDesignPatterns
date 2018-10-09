package com.enjoy.dp.AbstractFactory.example1;

import com.enjoy.dp.Command.example1.Box;
import com.enjoy.dp.Command.example1.GigaMainBoard;
import com.enjoy.dp.Command.example1.MainBoardApi;
import com.enjoy.dp.Command.example1.OpenCommand;
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
        //创建装机工程师对象
        ComputerEngineer engineer = new ComputerEngineer();
        //告诉装机工程师自己选择的配件，让装机工程师组装电脑
        engineer.makeComputer(1,2);
    }
}
