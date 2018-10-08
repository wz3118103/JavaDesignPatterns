package com.enjoy.dp.Flyweight.example1;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 20:31 2018/10/8
 * @Description :供测试用，在内存中模拟数据库中的值
 * @Modified By   :
 * @Version :
 */


public class TestDB {
    /**
     * 用来存放授权数据的值
     */
    public static Collection<String> colDB = new ArrayList<String>();

    static{
        //通过静态块来填充模拟的数据
        colDB.add("张三,人员列表,查看");
        colDB.add("李四,人员列表,查看");
        colDB.add("李四,薪资数据,查看");
        colDB.add("李四,薪资数据,修改");
        //增加更多的授权数据
        for(int i=0;i<3;i++){
            colDB.add("张三"+i+",人员列表,查看");
        }
    }
}
