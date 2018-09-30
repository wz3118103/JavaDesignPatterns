package com.enjoy.dp.Decorator.Clothes.decorators;

import com.enjoy.dp.Decorator.Clothes.Person;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 6:33 2018/10/1
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Hat extends ClothesDecorator {

    public Hat(Person person) {
        super(person);
    }

    @Override
    public void show() {
        //执行已有功能
        person.show();
        //此处是附加的功能
        System.out.println("戴上帽子，累计消费" + this.cost());
    }

    @Override
    public Double cost() {
        return person.cost() + 50; //帽子50元
    }
}
