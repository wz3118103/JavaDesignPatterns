package com.enjoy.dp.Decorator.Clothes.decorators;

import com.enjoy.dp.Decorator.Clothes.Person;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 6:33 2018/10/1
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Jacket extends ClothesDecorator {

    public Jacket(Person person) {
        super(person);
    }
    @Override
    public void show() {
        person.show();
        System.out.println("穿上夹克，累计消费" + this.cost());
    }

    @Override
    public Double cost() {
        return person.cost() + 100; //夹克100元
    }
}
