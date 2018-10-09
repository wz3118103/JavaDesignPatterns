package com.enjoy.dp.TemplateMethod.Cook;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 14:10 2018/10/1
 * @Description :
 * @Modified By   :
 * @Version :
 */
public abstract class Cook {
    protected boolean needBeforeCook = true;

    public void open(){
        System.out.println("打开抽油烟机");
    }
    public void fire(){
        System.out.println("生火");
    }
    /**
     * 期望子类去实现
     */
    public abstract void doCook();

    public void outfire(){
        System.out.println("灭火");
    }
    public void close(){
        System.out.println("关闭抽油烟机");
    }

    public void beforeCook(){};
    /**
     * 使用final关键字，防止子类重写
     */
    public final void cook(){
        if(this.needBeforeCook){
            beforeCook();
        }
        this.open();
        this.fire();
        this.doCook();
        this.outfire();
        this.close();
    }
}
