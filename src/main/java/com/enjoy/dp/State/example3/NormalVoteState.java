package com.enjoy.dp.State.example3;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 15:22 2018/10/7
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class NormalVoteState implements VoteState{
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //正常投票
        //记录到投票记录中
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("恭喜你投票成功");

        //正常投票完成，维护下一个状态，同一个人再投票就重复了
        voteManager.getMapState().put(user, new RepeatVoteState());
    }
}
