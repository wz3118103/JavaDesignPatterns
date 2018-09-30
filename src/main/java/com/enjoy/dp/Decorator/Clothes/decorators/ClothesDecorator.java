package com.enjoy.dp.Decorator.Clothes.decorators;

import com.enjoy.dp.Decorator.Clothes.Person;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 6:33 2018/10/1
 * @Description :
 * @Modified By   :
 * @Version :
 */
public abstract class ClothesDecorator implements Person {
    //装饰器中要使用被装饰器的对象，构造方法中传入
    protected Person person;

    public ClothesDecorator(Person person){
        this.person = person;
    }

}
