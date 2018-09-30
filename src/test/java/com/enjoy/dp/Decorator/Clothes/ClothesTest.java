package com.enjoy.dp.Decorator.Clothes;

import com.enjoy.dp.Decorator.Clothes.decorators.Hat;
import com.enjoy.dp.Decorator.Clothes.decorators.Jacket;
import org.junit.Test;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 6:35 2018/10/1
 * @Description :
 * @Modified By   :
 * @Version :
 */

public class ClothesTest{
    @Test
    public void clothesTest(){
        Person laowang = new LaoWang();
        //穿上夹克
        laowang = new Jacket(laowang);
         //戴上帽子
        laowang = new Hat(laowang);

        laowang.show();
        System.out.println("买单，老王总共消费："+laowang.cost());
    }
}