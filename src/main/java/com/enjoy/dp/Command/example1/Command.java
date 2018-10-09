package com.enjoy.dp.Command.example1;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 16:32 2018/10/9
 * @Description :命令接口，声明执行的操作
 * @Modified By   :
 * @Version :
 */

public interface Command {
    /**
     * 执行命令对应的操作
     */
    public void execute();
}