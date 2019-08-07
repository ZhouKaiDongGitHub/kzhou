package com.eis.job.timer;

import java.util.TimerTask;

public class TimerTaskTest02  extends TimerTask {
    @Override
    public void run() {
        System.out.println("固定时间到，执行此任务。。。。");
    }
}
