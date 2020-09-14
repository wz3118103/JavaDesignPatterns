package com.enjoy.dp.simplefactory.example5;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 15:04 2018/11/1
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class MyFactory {
    public static Api createApi() {
        // 读取配置文件到properties
        Properties properties = new Properties();
        InputStream in = null;
        try {
            in = MyFactory.class.getResourceAsStream("FactoryTest.properties");
            properties.load(in);
        } catch (IOException e) {
            System.out.println("加载文件出错");
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //使用反射创建properties指定的类实例
        Api api = null;
        try {
            api = (Api)Class.forName(properties.getProperty("ImplClass")).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return api;
    }
}
