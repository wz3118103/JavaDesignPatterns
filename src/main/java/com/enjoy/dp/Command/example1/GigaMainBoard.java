package com.enjoy.dp.Command.example1;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 16:32 2018/10/9
 * @Description : 技嘉主板类，开机命令的真正实现者，在Command模式中充当Receiver
 * @Modified By   :
 * @Version :
 */

public class GigaMainBoard implements MainBoardApi{
    /**
     * 真正的开机命令的实现
     */
    public void open(){
        System.out.println("技嘉主板现在正在开机，请等候");
        System.out.println("接通电源......");
        System.out.println("设备检查......");
        System.out.println("装载系统......");
        System.out.println("机器正常运转起来......");
        System.out.println("机器已经正常打开，请操作");
    }
}
