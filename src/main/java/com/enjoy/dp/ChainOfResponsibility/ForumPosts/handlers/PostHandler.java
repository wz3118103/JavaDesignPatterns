package com.enjoy.dp.ChainOfResponsibility.ForumPosts.handlers;

import com.enjoy.dp.ChainOfResponsibility.ForumPosts.Post;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 19:52 2018/10/1
 * @Description :
 * @Modified By   :
 * @Version :
 */
public abstract class PostHandler {

    /**
     * 后继者
     */
    protected PostHandler successor;

    public void setSuccessor(PostHandler handler){
        this.successor = handler;
    }

    public abstract void handlerRequest(Post post);

    protected final void next(Post post){
        if(this.successor != null){
            this.successor.handlerRequest(post);
        }
    }
}
