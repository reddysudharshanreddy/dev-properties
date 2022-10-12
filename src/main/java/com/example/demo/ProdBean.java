package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdBean 
{
	public ProdBean()
	{
		System.out.println("----ProdBean.ProdBean()");
	}
	
}
