package com.example.demo.entity;

public class Bird extends Animal{


public Bird() {
		super();
		System.out.println("Bird 建構方法");

	}
	//	public void eat() {
//		System.out.println("Bird 正在吃");
//	}
//	public void sleep() {
//		System.out.println("Bird 正在睡");
//	}
	@Override
	public void eat() {
		System.out.println(super.getName()+"邊吃邊玩");
	}
	public void flying() {
		System.out.println(super.getName()+"正在飛");
	}
}
