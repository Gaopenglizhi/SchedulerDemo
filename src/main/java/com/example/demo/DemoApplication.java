package com.example.demo;

import com.example.demo.task.DynamicAddTask;
import com.example.demo.task.MyJob;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableScheduling
public class DemoApplication {
	public static String JOB_NAME = "D0000";
	public static String TRIGGER_NAME = "动态任务触发器";
	public static String JOB_GROUP_NAME = "XLXXCC_JOB_GROUP";
	public static String TRIGGER_GROUP_NAME = "XLXXCC_JOB_GROUP";
	public static String JOB_NAME1 = "D0001";
	public static String TRIGGER_NAME1 = "动态任务触发器1";
	public static String JOB_GROUP_NAME1 = "XLXXCC_JOB_GROUP1";
	public static String TRIGGER_GROUP_NAME1 = "XLXXCC_JOB_GROUP1";
	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		try {
			DynamicAddTask.addJob(JOB_NAME, JOB_GROUP_NAME, TRIGGER_NAME, TRIGGER_GROUP_NAME, MyJob.class, "0/5 * * * * ?");
			DynamicAddTask.addJob(JOB_NAME1, JOB_GROUP_NAME1, TRIGGER_NAME1, TRIGGER_GROUP_NAME1, MyJob.class, "0/5 * * * * ?");
			//Thread.sleep(5000);
			//DynamicAddTask.modifyJobTime(JOB_NAME, JOB_GROUP_NAME, TRIGGER_NAME, TRIGGER_GROUP_NAME, "0/10 * * * * ?");
			//DynamicAddTask.modifyJobTime(JOB_NAME1, JOB_GROUP_NAME1, TRIGGER_NAME1, TRIGGER_GROUP_NAME1, "0/20 * * * * ?");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
