package com.enjoy.dp.Flyweight.example4;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 20:49 2018/10/8
 * @Description :描述享元对象缓存的配置对象
 * @Modified By   :
 * @Version :
 */

public class CacheConfModel{
    /**
     * 缓存开始计时的开始时间
     */
    private long beginTime;
    /**
     * 缓存对象存放的持续时间，其实是最长不被使用的时间
     */
    private double durableTime;
    /**
     * 缓存对象需要被永久存储，也就是不需要从缓存中删除
     */
    private boolean forever;
    public boolean isForever() {
        return forever;
    }
    public void setForever(boolean forever) {
        this.forever = forever;
    }
    public long getBeginTime() {
        return beginTime;
    }
    public void setBeginTime(long beginTime) {
        this.beginTime = beginTime;
    }
    public double getDurableTime() {
        return durableTime;
    }
    public void setDurableTime(double durableTime) {
        this.durableTime = durableTime;
    }
}
