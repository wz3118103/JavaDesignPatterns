package com.enjoy.dp.Proxy.Ticket;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 15:08 2018/10/1
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class TicketTest {
    @Test
    public void ticketTest(){
        TicketSell sell = new ProxyStation();
        sell.buyTicket();
        sell.buyTicket();
    }

    @Test
    public void dynamicProxyTest(){
        Station station = new Station();
        InvocationHandler handler = new StockHandler(station);

        Class<?> cls = station.getClass();
        ClassLoader loader = cls.getClassLoader();
        TicketSell sell = (TicketSell)Proxy.newProxyInstance(loader,cls.getInterfaces(),handler);

        sell.buyTicket();
        sell.buyTicket();
    }
}
