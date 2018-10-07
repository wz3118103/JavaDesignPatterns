package com.enjoy.dp.State.example2;

import org.junit.Test;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 14:10 2018/10/7
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Ex2Test {
    @Test
    public void ex2Test() {
        VoteManager vm = new VoteManager();
        for(int i=0;i<8;i++){
            vm.vote("u1", "A");
        }
    }
}
