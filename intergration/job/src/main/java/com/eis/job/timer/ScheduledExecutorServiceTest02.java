package com.eis.job.timer;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceTest02 {
    private ScheduledExecutorService scheduledExecutorService;
    public long start ;

    public ScheduledExecutorServiceTest02(){
        scheduledExecutorService = Executors.newScheduledThreadPool(2);
        start = System.currentTimeMillis();
    }

    public void taskOne(){
        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
               throw new RuntimeException();
            }
        },1000, TimeUnit.MILLISECONDS);
    }

    public void taskTwe(){
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("taskTwe invoke,the time"+(System.currentTimeMillis()-start));
            }
        },3000,500,TimeUnit.MILLISECONDS);
    }

    public static void main(String[] args) {
        ScheduledExecutorServiceTest02 test01 = new ScheduledExecutorServiceTest02();
        test01.taskOne();
        test01.taskTwe();
    }
}
