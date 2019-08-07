package com.eis.job.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class QuartzTest  {
    public static void main(String[] args) {
        //定义一个JobDetail
        JobDetail jobDetail = JobBuilder.newJob(JobTask.class).
                //定义name和group
                withIdentity("job1","group1").
                        //需要传入的数据
                        usingJobData("name","sdas").build();
        Trigger trigger = TriggerBuilder.newTrigger().
                //定义name和group
                withIdentity("tragger1","group1").startNow().
                        //定义每一秒钟执行一次
                        withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(1).repeatForever()).build();
        //创建Scheduler
        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            scheduler.scheduleJob(jobDetail,trigger);
            scheduler.start();
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            scheduler.shutdown();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }

    }
}
