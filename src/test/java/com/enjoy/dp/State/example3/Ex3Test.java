package com.enjoy.dp.State.example3;

import org.junit.Test;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 15:24 2018/10/7
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Ex3Test {
    @Test
    public void ex3Test() {
        VoteManager vm = new VoteManager();
        for(int i=0;i<12;i++){
            vm.vote("u1", "A");
        }
    }
}
