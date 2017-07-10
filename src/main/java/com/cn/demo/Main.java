package com.cn.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  
@RequestMapping("/boot") 
public class Main { 
	 @RequestMapping("/index")  
	    public String main(Model model){  
	        model.addAttribute("name", "spring boot");  
	        return "index";  
	    }  

}
