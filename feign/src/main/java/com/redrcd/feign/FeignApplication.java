package com.redrcd.feign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignApplication {
	private static Logger logger = LoggerFactory.getLogger(FeignApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(FeignApplication.class, args);
		logger.info("----微服务feign启动----");
	}
}
