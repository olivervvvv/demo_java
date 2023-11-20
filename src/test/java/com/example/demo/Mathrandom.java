package com.example.demo;

import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Mathrandom {
	
	@Test
	public void mathtest(){
	int Ans=(int)(Math.random()*100);
	System.out.println("答案是"+Ans);
	int max=99,min=1;
	Scanner inputmath = new Scanner(System.in);
	Random ran =new Random();
//	int i=inputmath.nextInt();
	int bin = ran.nextInt(20,20);
	while(inputmath.hasNext()) {
		int i=inputmath.nextInt();
		if(i<Ans) {
			if(i>min)min=i;
			System.out.printf("比答案小，請在%d到%d猜一個數\n",min,max);
			
		};
		if(i>Ans){
			if(i<max)max=i;
			System.out.printf("比答案大，請在%d到%d猜一個數\n",min,max);
		
		};
		if(i==Ans) {
			System.out.printf("答案是%d猜對了!!!\n",Ans);
			break;
		}
		}
	
	}
}
