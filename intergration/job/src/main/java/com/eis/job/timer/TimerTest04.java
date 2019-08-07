package com.eis.job.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer处理多线程TimerTask时遇到的问题演示
 */
public class TimerTest04{
    //一个Timer
    private  Timer timer;

    public long start;

    public TimerTest04(){
        timer = new Timer();
        start = System.currentTimeMillis();
    }

    public void timeTaskOne(){
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("TimeTaskOne invoke,the time"+(System.currentTimeMillis()-start));
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },1000);
    }

    public void timeTaskTwe(){
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("TimeTaskTwe invoke,the time"+(System.currentTimeMillis()-start));
            }
        },3000);
    }

    public static void main(String[] args){
        TimerTest04 timerTest04 = new TimerTest04();
        timerTest04.timeTaskOne();
        timerTest04.timeTaskTwe();
    }
}
