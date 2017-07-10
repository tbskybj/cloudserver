package com.cn.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cn.model.User;

//@RestController可以默认以json格式返回数据
@RestController
public class HelloWorldController {
	private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
	
	@Value("${com.neo.title}")
	private String title;
	  @RequestMapping("/getUser")
	  public User getUser() {
		  System.out.println("111111");
		  logger.info("获取user信息");
		  logger.error("而111");
	    	User user=new User();
	    	user.setUseName(title); 
	    	user.setPassword("xxxx");
	        return user;
	    }
}
