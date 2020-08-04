package com.demo.test;

public class Main {

	public static void main(String[] args) {
		
		Demo d=new Demo() {

			@Override
			public String greet() {
				return "Good Morning";
			}
			
		};
		
		Demo d1=new Demo() {

			@Override
			public String greet() {
				
				return "Good Evening";
			}
			
		};

	}

}
