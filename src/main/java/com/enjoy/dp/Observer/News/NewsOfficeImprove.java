package com.enjoy.dp.Observer.News;

import com.enjoy.dp.Observer.News.observers.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 7:43 2018/10/1
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class NewsOfficeImprove  implements ISubject{

    private List<Customer> observers = new ArrayList<>();

    //模拟报纸来了
    public void newspaperCome(){
        this.notifyObservers();
    }

    @Override
    public void registerObserver(Customer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Customer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Customer observer : observers){
            observer.update();
        }
    }
}
