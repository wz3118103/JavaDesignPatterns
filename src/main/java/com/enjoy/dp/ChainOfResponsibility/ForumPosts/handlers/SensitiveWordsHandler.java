package com.enjoy.dp.ChainOfResponsibility.ForumPosts.handlers;

import com.enjoy.dp.ChainOfResponsibility.ForumPosts.Post;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 19:54 2018/10/1
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class SensitiveWordsHandler extends PostHandler {

    @Override
    public void handlerRequest(Post post) {
        //屏蔽敏感词
        String content = post.getContent();
        //.....
        content = content.replace("敏感词","**");
        post.setContent(content);

        System.out.println("过滤敏感词...");
        //传递给下一个处理器
        next(post);
    }
}