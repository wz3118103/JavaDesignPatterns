package com.enjoy.dp.ResponsibilityChain.ForumPosts.handlers;

import com.enjoy.dp.ResponsibilityChain.ForumPosts.Post;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 19:53 2018/10/1
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class PornHandler extends PostHandler {

    @Override
    public void handlerRequest(Post post) {
        //屏蔽涉黄内容
        String content = post.getContent();
        //.....
        content = content.replace("涉黄","**");
        post.setContent(content);

        System.out.println("过滤涉黄内容...");
        //传递给下一个处理器
        next(post);
    }
}