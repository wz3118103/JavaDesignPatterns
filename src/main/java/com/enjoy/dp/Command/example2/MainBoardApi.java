package com.enjoy.dp.Command.example2;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 16:36 2018/10/9
 * @Description :主板的接口
 * @Modified By   :
 * @Version :
 */

public interface MainBoardApi {
    /**
     * 主板具有能开机的功能
     */
    public void open();
    /**
     * 主板具有实现重启的功能
     */
    public void reset();
}
