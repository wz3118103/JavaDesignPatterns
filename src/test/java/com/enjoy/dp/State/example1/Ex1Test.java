package com.enjoy.dp.State.example1;

import org.junit.Test;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 13:50 2018/10/7
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Ex1Test {
    @Test
    public void ex1Test(){
        VoteManager vm = new VoteManager();
        for(int i=0;i<8;i++){
            vm.vote("u1", "A");
        }
    }
}
