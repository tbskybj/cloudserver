package com.cn.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(value=1)
public class ApplicationConfigure implements CommandLineRunner   {

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("==========启动加载11==============");
		
	}

}
