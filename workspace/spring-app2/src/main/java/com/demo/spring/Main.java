package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.service.EmpRegisterApp;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		EmpRegisterApp app =  (EmpRegisterApp)ctx.getBean("empRegisterApp");
		String resp = app.registerEmp(100, "Rupa", "Pune", 56000);
		System.out.println(resp);
		
		System.out.println(app.getClass().getName());
		EmpRegisterApp app1 = (EmpRegisterApp) ctx.getBean("empRegisterApp");
		
		System.out.println(app1==app);

	}

}
