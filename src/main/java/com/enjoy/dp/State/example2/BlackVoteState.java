package com.enjoy.dp.State.example2;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 14:09 2018/10/7
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class BlackVoteState implements VoteState{
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //黑名单
        //记入黑名单中，禁止登录系统了
        System.out.println("进入黑名单，将禁止登录和使用本系统");
    }
}
