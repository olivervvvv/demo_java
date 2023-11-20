package com.example.demo;

import org.junit.jupiter.api.Test;

import com.example.demo.entity.Animal;
import com.example.demo.entity.Bird;
import com.example.demo.entity.a;
import com.example.demo.entity.c;

public class extendsTest {
	@Test
	public void extendsTest() {
		Animal anim = new Animal();
		System.out.println("animal name: "+anim.getName());
		anim.eat();
		anim.sleep();
		Bird bird = new Bird();
		bird.setName("¤jºµ");
		System.out.println("animal name: "+bird.getName());
		bird.eat();
		bird.sleep();
		bird.flying();
	}
	@Test
	public void extendsTest1() {
		c C = new c("AAA","VVV","CCC");
		a A = new a("BBB","DDD","EEE");
		System.out.println("City: "+C.getCity());
		System.out.println("Country: "+C.getCountry());
		System.out.println("State: "+C.getState());
		System.out.println("================");
		System.out.println("AState: "+A.getCity());


	}
}
