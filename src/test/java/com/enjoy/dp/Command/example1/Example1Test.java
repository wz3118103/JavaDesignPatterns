package com.enjoy.dp.Command.example1;

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
        //1：把命令和真正的实现组合起来，相当于在组装机器，
        //把机箱上按钮的连接线插接到主板上。
        MainBoardApi mainBoard = new GigaMainBoard();
        OpenCommand openCommand = new OpenCommand(mainBoard);
        //2：为机箱上的按钮设置对应的命令，让按钮知道该干什么
        Box box = new Box();
        box.setOpenCommand(openCommand);

        //3：然后模拟按下机箱上的按钮
        box.openButtonPressed();
    }
}
