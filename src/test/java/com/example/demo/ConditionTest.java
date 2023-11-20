package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ConditionTest {
	
	@Test
	public void iftest(){
		System.out.print("請輸入今天星期:");
		Scanner scan = new Scanner(System.in);
		int x = 0,Ans=0;
		String y="";
		String a = scan.nextLine();
		System.out.print("請輸入要查詢的天數:");
		int hit = scan.nextInt();
		System.out.println("輸入的星期是:" + a);
		switch(a) {
		case "一":
			x=1;
			break;
		case "二":
			x=2;
			break;
		case "三":
			x=3;
			break;
		case "四":
			x=4;
			break;
		case "五":
			x=5;
			break;
		case "六":
			x=6;
			break;
		case "日":
			x=0;
			break;
		}
		Ans=(x+hit)%7;
//		System.out.println(Ans);
		switch(Ans) {
		case 1:
			System.out.print(hit+"天後是星期一");
			break;
		case 2:
			System.out.print(hit+"天後是星期二");
			break;
		case 3:
			System.out.print(hit+"天後是星期三");
			
			break;
		case 4:
			System.out.print(hit+"天後是星期四");
			
			break;
		case 5:
			System.out.print(hit+"天後是星期五");
			
			break;
		case 6:
			System.out.print(hit+"天後是星期六");
		
			break;
		case 0:
			System.out.print(hit+"天後是星期日");
			
			break;
		}
	} 
}
