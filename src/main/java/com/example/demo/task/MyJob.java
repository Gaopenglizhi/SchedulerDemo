package com.example.demo.task;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.time.LocalTime;


public class MyJob implements Job {

    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println(jobExecutionContext.getJobDetail().getJobDataMap().getString("Code")+ ";;;;1111111111111111111");
        System.out.println(LocalTime.now() + ": doing something...");
    }
}
