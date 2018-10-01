package com.enjoy.dp.Adapter.Music.adapter;

import com.enjoy.dp.Adapter.Music.MusicPlayer;
import com.enjoy.dp.Adapter.Music.util.ExistPlayer;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 10:49 2018/10/1
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class PlayerAdapter implements MusicPlayer
{
    //在适配器中使用旧接口
    private ExistPlayer player;

    public PlayerAdapter(){
        player = new ExistPlayer();
    }

    @Override
    public void play(String type, String filename) {
        if(type == "mp3"){
            player.playMp3(filename);
        }else if(type == "wma"){
            player.playWma(filename);
        } else {
            System.out.println("cannot resolve " + type + " format");
        }
    }
}
