package com.wasu.tenxcloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TenxcloudEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TenxcloudEurekaApplication.class, args);
	}

}
