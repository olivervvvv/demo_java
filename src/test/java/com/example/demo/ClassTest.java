package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import com.example.demo.entity.Dog;
import com.example.demo.entity.TaipeiBank;

public class ClassTest {
//	@Test
//	public void classTest(){
//		Dog yourDog = new Dog();
//		String i="marrgg";
//		yourDog.setName(i);
//		System.out.print("yourDog.getName()");
//		
//	}
	@Test
	public void classTest1(){
		TaipeiBank bank = new TaipeiBank();
		System.out.print(bank.getBalance());
		Assert.isTrue(bank.getBalance() == 1000, "saving error!");
		bank.saving(100);
	}
	@Test
	public void classTest2(){
		Dog dog = new Dog();
		dog.setName("Lily");
		dog.setAge(2);
		System.out.print("========");
		Dog dogg = new Dog("QQQQ","GGG",3);
	}
}
