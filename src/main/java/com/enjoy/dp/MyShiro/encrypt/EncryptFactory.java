package com.enjoy.dp.MyShiro.encrypt;

public class EncryptFactory {
    /**
     * md5
     * @param clazz
     * @return
     */
    public static PasswordEncrypt create(String clazz){

        try {
            Class cls = Class.forName(clazz);
            Object obj = cls.newInstance();
            if(obj instanceof PasswordEncrypt){
                return (PasswordEncrypt)obj;
            }else{
                throw new RuntimeException("class not found:" + clazz);
            }
        } catch (Exception e) {
            throw new RuntimeException("class not found:" + clazz);
        }
    }
}
