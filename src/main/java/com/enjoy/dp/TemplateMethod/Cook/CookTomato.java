package com.enjoy.dp.TemplateMethod.Cook;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 14:11 2018/10/1
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class CookTomato extends Cook {

    @Override
    public void beforeCook() {
        System.out.println("焚香三日，沐浴更衣");
    }

    @Override
    public void doCook() {
        System.out.println("西红柿炒蛋");
    }
}
