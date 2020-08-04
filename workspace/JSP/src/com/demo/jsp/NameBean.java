package com.demo.jsp;

public class NameBean {
	String firstName;
	String lastName;
	String name;

	public NameBean() {
		// TODO Auto-generated constructor stub
	}
	public NameBean(String firstName, String lastName, String name) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return name = firstName + " " + lastName;
	}

	public void setName(String name) {
		this.name = name;
	}
}
