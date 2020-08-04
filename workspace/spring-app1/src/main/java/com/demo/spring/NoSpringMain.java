package com.demo.spring;

public class NoSpringMain {

	public static void main(String[] args) {
		Message message=new Message();
		message.setBody("Lunch Break at 1:00pm");
		message.setHeader("Lunch Break");
		
		Mail mail=new Mail();
		mail.setToAddress("all");
		mail.setFromAddress("Shantanu");
		mail.setMessage(message);
		
		System.out.println(mail.getMessage().getBody());
		
		
		
		Message message1=new Message("Lunch Break","Lunch Break at 1:00pm");
		
		Mail mail1=new Mail("all","Shantanu",message1);
		

		System.out.println(mail1.getMessage().getBody());
	}

}
