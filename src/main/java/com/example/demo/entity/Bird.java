package com.example.demo.entity;

public class Bird extends Animal{


public Bird() {
		super();
		System.out.println("Bird �غc��k");

	}
	//	public void eat() {
//		System.out.println("Bird ���b�Y");
//	}
//	public void sleep() {
//		System.out.println("Bird ���b��");
//	}
	@Override
	public void eat() {
		System.out.println(super.getName()+"��Y�䪱");
	}
	public void flying() {
		System.out.println(super.getName()+"���b��");
	}
}
