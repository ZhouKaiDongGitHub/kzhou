package com.eis.job.timer;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 用ScheduledExecutorService来代替timer执行多线程任务（job）
 */
public class ScheduledExecutorServiceTest01 {
    private ScheduledExecutorService scheduledExecutorService;
    public long start ;

    public ScheduledExecutorServiceTest01(){
        scheduledExecutorService = Executors.newScheduledThreadPool(2);
        start = System.currentTimeMillis();
    }

    public void taskOne(){
        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("taskOne invoke,the time"+(System.currentTimeMillis()-start));
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },1000, TimeUnit.MILLISECONDS);
    }

    public void taskTwe(){
        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("taskTwe invoke,the time"+(System.currentTimeMillis()-start));
            }
        },3000,TimeUnit.MILLISECONDS);
    }

    public static void main(String[] args) {
        ScheduledExecutorServiceTest01 test01 = new ScheduledExecutorServiceTest01();
        test01.taskOne();
        test01.taskTwe();
    }
}
