package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{
	/*
	 * @Value("${my.message}") private String message;
	 * 
	 * @Value("${my.usercount}") private int usercount;
	 * 
	 * @Value("${my.contactinfo}") private String contactinfo;
	 */
	
	@Autowired
	MyApplicationBean myAppBean;
	
	@GetMapping("/")
	public String welcome()
	{
		return myAppBean.getMessage()+
				", user count is"+myAppBean.getUsercount()
				+", contact info:"+myAppBean.getContactinfo()
				+",Deployed in:"+myAppBean.getEnv()
				+","+myAppBean.getThankyoumessage();
	}

}
