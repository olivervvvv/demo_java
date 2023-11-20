package com.example.demo.entity;

public class Dog {
	private String name;
	private String color;
	private int age;
	
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, String color, int age) {
		// TODO Auto-generated constructor stub
		super();
		this.name=name;
		this.color=color;
		this.age=age;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		
		this.name = name;
		
	}
	public String getColor() {
		return color;
	}
	
}

