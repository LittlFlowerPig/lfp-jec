package com.lfp.jec.balance.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
//负载均衡 - feign
@EnableFeignClients
//微服务 - 注册服务，【使用Eureka时，等同于@EnableEurekaClient】
@EnableDiscoveryClient
public class JecBalanceJobApplication {

	public static void main(String[] args) {
		SpringApplication.run(JecBalanceJobApplication.class, args);
	}
}
