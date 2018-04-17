package com.examole.QyartzCluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.*"})
@ImportResource("quartz.xml")
public class SimpleQuartzClusterApplication {

	public static void main(String[] args) {
//		Logger.info("简单Quartz-Cluster微服务入口函数编码-" + System.getProperty("file.encoding"));

		System.out.println("简单Quartz-Cluster微服务入口函数编码-" + System.getProperty("file.encoding"));
		
		SpringApplication.run(SimpleQuartzClusterApplication.class, args);

		System.out.println("【【【【【【 简单Quartz-Cluster微服务 】】】】】】已启动.");
	}
}
