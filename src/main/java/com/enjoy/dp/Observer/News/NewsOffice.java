package com.enjoy.dp.Observer.News;

import com.enjoy.dp.Observer.News.observers.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 7:27 2018/10/1
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class NewsOffice {

    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }
    //模拟报纸来了
    public void newspaperCome(){
        this.notifyAllObservers();
    }

    public void notifyAllObservers(){
        for (Customer customer : customers){
            customer.update();
        }
    }
}
