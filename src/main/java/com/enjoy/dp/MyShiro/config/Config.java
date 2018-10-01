package com.enjoy.dp.MyShiro.config;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class Config {

    private static Map<String, String> configMap = new HashMap<>();

    static {
        InputStream in = Config.class.getResourceAsStream("/permission.ini");
        DataInputStream dis = new DataInputStream(in);
        String str;
        try{
            while ((str = dis.readLine()) != null){
                String[] configs = str.split("=");
                if(configs.length == 2){
                    configMap.put(configs[0].trim(),configs[1].trim());
                }
            }
            dis.close();
        }catch (Exception e){
            throw new RuntimeException("配置文件不存在");
        }

    }

    public static String get(String name){
        return configMap.get(name);
    }

    public static String get(String name,String defaultValue){
        String value = configMap.get(name);
        return value == null ? defaultValue : value;
    }


}
