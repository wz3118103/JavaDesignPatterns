package com.enjoy.dp.MyShiro.util;

import com.enjoy.dp.MyShiro.subject.Subject;

import java.util.HashMap;
import java.util.Map;

public class SecurityUtils {

    private static Map<String, Subject> subjectList = new HashMap<>();

    /**
     * 获取当前请求的用户
     * @return
     */
    public static Subject getSubject(){
        //此处应借用session等方式获取当前请求用户
        String name = "123";
        Subject subject = subjectList.get(name);
        return subject == null ? new Subject() : subject;
    }

    public static void addSubject(Subject subject){
        subjectList.put("123",subject);
    }
}
