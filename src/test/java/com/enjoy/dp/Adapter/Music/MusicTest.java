package com.enjoy.dp.Adapter.Music;

import com.enjoy.dp.Adapter.Music.adapter.PlayerAdapter;
import org.junit.Test;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 10:50 2018/10/1
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class MusicTest {
    @Test
    public void newsTest() {
        MusicPlayer player = new PlayerAdapter();
        player.play("mp3","xxx.mp3");
        player.play("mp4","xxx.mp4");
    }
}
