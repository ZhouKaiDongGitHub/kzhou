package com.eis.job.timer;

import java.util.Timer;

/**
 * 测试Timer
 */
public class TimerTest01 {
    //声明一个Timer
    Timer timer ;

    public TimerTest01(int time){
        timer = new Timer();
        timer.schedule(new TimerTaskTest01(),time*1000);
    }


    public static void main(String[] args){
        System.out.println("Timer启动。。。。");
        new TimerTest01(3);
    }
}
