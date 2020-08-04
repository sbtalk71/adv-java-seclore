package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("context.xml");
		
		//Mail mail=(Mail)ctx.getBean("mymail");
		
		Mail mail=ctx.getBean(Mail.class);
		
		
		
		Mail mail1=ctx.getBean(Mail.class);
		
		System.out.println("Are they same beans "+(mail==mail1));
	}

}
