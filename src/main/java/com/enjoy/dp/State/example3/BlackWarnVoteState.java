package com.enjoy.dp.State.example3;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 15:23 2018/10/7
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class BlackWarnVoteState implements VoteState{
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //待进黑名单警告状态
        System.out.println("禁止登录和使用系统3天");

        //待进黑名单警告状态处理完成，维护下一个状态，投票到10次，就进黑名单了
        //注意这里是判断大于等于9，因为这里设置的是下一个状态
        //下一个操作次数就是10了，就应该算是进黑名单了
        if(voteManager.getMapVoteCount().get(user) >= 9){
            voteManager.getMapState().put(user, new BlackVoteState());
        }
    }
}
