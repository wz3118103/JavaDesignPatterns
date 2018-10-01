package com.enjoy.dp.Observer.News;

import com.enjoy.dp.Observer.News.observers.Customer;

public interface ISubject {

    public void registerObserver(Customer observer);
    public void removeObserver(Customer observer);
    public void notifyObservers();
}
