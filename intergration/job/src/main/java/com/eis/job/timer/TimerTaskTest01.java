package com.eis.job.timer;

import java.util.TimerTask;

public class TimerTaskTest01 extends TimerTask {

    @Override
    public void run() {
        System.out.println("指定间隔时间到，执行此任务。。。。");
    }

}
