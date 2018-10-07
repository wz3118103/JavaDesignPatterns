package com.enjoy.dp.State.example3;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 15:23 2018/10/7
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
