package com.cn.configserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
//@EnableConfigServer注解，开启Config Server
@EnableConfigServer
@SpringBootApplication
public class ApplicationConfigServer {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ApplicationConfigServer.class).web(true).run(args);
	}

}
