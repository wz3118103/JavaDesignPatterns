package com.enjoy.dp.TemplateMethod.Cook;

import org.junit.Test;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 14:14 2018/10/1
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class CookTest {
    @Test
    public void cookTest(){
        Cook cook = new CookTomato();
        cook.cook();
    }
}
