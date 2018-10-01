package com.enjoy.dp.Proxy.Ticket;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 15:07 2018/10/1
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Station implements TicketSell{
    @Override
    public void buyTicket() {
        System.out.println("有人买了一张票");
    }
}
