package com.redrcd.eurekaclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApplication {
	private static Logger logger = LoggerFactory.getLogger(EurekaClientApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
		logger.info("----EurekaClient服务启动----");
	}
}
