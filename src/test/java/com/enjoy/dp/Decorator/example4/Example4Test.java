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
    public void example4Test1() {
    //public static void main(String[] args) {
        //流式输出文件
        DataOutputStream dout = null;
        try {
            dout = new DataOutputStream(
                  new EncryptOutputStream2(
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

    @Test
    public void example4Test2() throws Exception{
        //流式读取文件
        DataInputStream din = null;
        try{
            din = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream("MyEncrypt.txt")
                    )
            );
            //然后就可以获取文件内容了
            byte bs []= new byte[din.available()];
            din.read(bs);
            String content = new String(bs);
            System.out.println("文件内容===="+content);
        }finally{
            din.close();
        }
    }
}
