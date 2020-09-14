package com.enjoy.dp.facade.ComputeStart;

import com.enjoy.dp.facade.ComputeStart.modules.CPU;
import com.enjoy.dp.facade.ComputeStart.modules.Disk;
import com.enjoy.dp.facade.ComputeStart.modules.Memory;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 14:35 2018/10/1
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class StartButton {
    public void start(){
        new CPU().start();
        new Disk().start();
        new Memory().start();
    }
}
