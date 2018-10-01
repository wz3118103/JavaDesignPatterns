package com.enjoy.dp.Observer.News;

import com.enjoy.dp.Observer.News.observers.Customer;
import com.enjoy.dp.Observer.News.observers.CustomerA;
import com.enjoy.dp.Observer.News.observers.CustomerB;
import com.enjoy.dp.Observer.News.observers.CustomerC;
import org.junit.Test;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 7:29 2018/10/1
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class NewsTest {
    @Test
    public void newsTest() {
        NewsOffice office= new NewsOffice();

        Customer customerA = new CustomerA();
        Customer customerB = new CustomerB();
         //客户A订阅报纸
        office.addCustomer(customerA);
         //客户B订阅报纸
        office.addCustomer(customerB);
        //报纸来了
        office.newspaperCome();
    }

    @Test
    public void newsImproveTest() {
        ISubject office= new NewsOfficeImprove();

        Customer customerA = new CustomerA();
        Customer customerB = new CustomerB();

        office.registerObserver(customerA);
        office.registerObserver(customerB);

        ((NewsOfficeImprove) office).newspaperCome();
    }

    @Test
    public void news2Test() {
        Observable office= new NewsOffice2();

        Observer customerC = new CustomerC();
        //客户A订阅报纸
        office.addObserver(customerC);
        //报纸来了
        ((NewsOffice2) office).newspaperCome();
    }
}
