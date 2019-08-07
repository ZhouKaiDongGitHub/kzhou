package com.eis.job.timer;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class TimerTest02 {
    Timer timer;

    public TimerTest02(){
        Date date = getDate();
        System.out.println("指定时间：time"+date);
        timer = new Timer();
        timer.schedule(new TimerTaskTest02(),date);

    }

    private Date getDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY,14);
        calendar.set(Calendar.MINUTE,00);
        calendar.set(Calendar.SECOND,00);
        Date date = calendar.getTime();
        return date;
    }

    public static void main(String[] args){
        System.out.println("开始执行定时任务。。。。");
        new TimerTest02();
    }
}
