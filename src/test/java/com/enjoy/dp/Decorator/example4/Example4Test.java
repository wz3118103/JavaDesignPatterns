package com.enjoy.dp.Decorator.example4;

import org.junit.Test;

import java.io.*;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 16:08 2018/10/9
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Example4Test {
    @Test
    public void example4Test() {
    //public static void main(String[] args) {
        //流式输出文件
        DataOutputStream dout = null;
        try {
            dout = new DataOutputStream(
                    new EncryptOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream("MyEncrypt.txt"))));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //然后就可以输出内容了
        try {
            dout.write("abcdxyz".getBytes());
            dout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
