package com.lfp.jec.service.log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//微服务 - 注册服务
@EnableEurekaClient
public class JecServiceLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(JecServiceLogApplication.class, args);
	}
}
