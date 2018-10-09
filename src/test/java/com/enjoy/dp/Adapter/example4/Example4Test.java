package com.enjoy.dp.Adapter.example4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
        //准备日志内容，也就是测试的数据
        LogModel lm1 = new LogModel();
        lm1.setLogId("001");
        lm1.setOperateUser("admin");
        lm1.setOperateTime("2010-03-02 10:08:18");
        lm1.setLogContent("这是一个测试");

        List<LogModel> list = new ArrayList<LogModel>();
        list.add(lm1);


        //创建新版的操作日志的接口对象
        LogDbOperateApi api = new ClassAdapter("");

        //保存日志文件
        api.createLog(lm1);

        //读取日志文件的内容
        List<LogModel> allLog = api.getAllLog();
        System.out.println("allLog="+allLog);
    }
}
