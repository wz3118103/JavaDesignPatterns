package com.enjoy.dp.State.example2;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 14:08 2018/10/7
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class SpiteVoteState implements VoteState{
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //恶意投票
        //取消用户的投票资格，并取消投票记录
        String s = voteManager.getMapVote().get(user);
        if(s!=null){
            voteManager.getMapVote().remove(user);
        }
        System.out.println("你有恶意刷票行为，取消投票资格");
    }
}
