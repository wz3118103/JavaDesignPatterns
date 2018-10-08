package com.enjoy.dp.Memento.example2;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 21:41 2018/10/8
 * @Description :负责保存模拟运行流程A的对象的备忘录对象
 * @Modified By   :
 * @Version :
 */

public class FlowAMementoCareTaker {
    /**
     * 记录被保存的备忘录对象
     */
    private FlowAMockMemento memento = null;
    /**
     * 保存备忘录对象
     * @param memento 被保存的备忘录对象
     */
    public void saveMemento(FlowAMockMemento memento){
        this.memento = memento;
    }
    /**
     * 获取被保存的备忘录对象
     * @return 被保存的备忘录对象
     */
    public FlowAMockMemento retriveMemento(){
        return this.memento;
    }
}
