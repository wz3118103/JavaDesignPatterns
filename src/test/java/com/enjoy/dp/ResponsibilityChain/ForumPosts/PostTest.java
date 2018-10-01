package com.enjoy.dp.ResponsibilityChain.ForumPosts;

import com.enjoy.dp.ResponsibilityChain.ForumPosts.handlers.AdHandler;
import com.enjoy.dp.ResponsibilityChain.ForumPosts.handlers.PornHandler;
import com.enjoy.dp.ResponsibilityChain.ForumPosts.handlers.PostHandler;
import com.enjoy.dp.ResponsibilityChain.ForumPosts.handlers.SensitiveWordsHandler;
import org.junit.Test;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 19:55 2018/10/1
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class PostTest {
    @Test
    public void postTest(){
        //创建责任对象
        PostHandler adHandler = new AdHandler();
        PostHandler pornHandler = new PornHandler();
        PostHandler swHandler = new SensitiveWordsHandler();

        //形成责任链
        pornHandler.setSuccessor(swHandler);
        adHandler.setSuccessor(pornHandler);

        Post post = new Post();
        post.setContent("我是正常内容，我是广告，我是涉黄，我是敏感词，我是正常内容");

        System.out.println("过滤前的内容为："+post.getContent());

        adHandler.handlerRequest(post);

        System.out.println("过滤后的内容为："+post.getContent());
    }
}
