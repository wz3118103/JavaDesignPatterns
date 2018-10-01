package com.enjoy.dp.Observer.News;

import java.util.Observable;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 8:10 2018/10/1
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class NewsOffice2 extends Observable {

    /**
     * 模拟报纸来了
     */
    public void newspaperCome(){
        this.setChanged();
        this.notifyObservers();
    }
}