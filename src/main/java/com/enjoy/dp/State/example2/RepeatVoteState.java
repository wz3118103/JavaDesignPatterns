package com.enjoy.dp.State.example2;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 14:08 2018/10/7
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class RepeatVoteState implements VoteState{
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //重复投票
        //暂时不做处理
        System.out.println("请不要重复投票");
    }
}
