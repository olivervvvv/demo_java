package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ConditionTest {
	
	@Test
	public void iftest(){
		System.out.print("�п�J���ѬP��:");
		Scanner scan = new Scanner(System.in);
		int x = 0,Ans=0;
		String y="";
		String a = scan.nextLine();
		System.out.print("�п�J�n�d�ߪ��Ѽ�:");
		int hit = scan.nextInt();
		System.out.println("��J���P���O:" + a);
		switch(a) {
		case "�@":
			x=1;
			break;
		case "�G":
			x=2;
			break;
		case "�T":
			x=3;
			break;
		case "�|":
			x=4;
			break;
		case "��":
			x=5;
			break;
		case "��":
			x=6;
			break;
		case "��":
			x=0;
			break;
		}
		Ans=(x+hit)%7;
//		System.out.println(Ans);
		switch(Ans) {
		case 1:
			System.out.print(hit+"�ѫ�O�P���@");
			break;
		case 2:
			System.out.print(hit+"�ѫ�O�P���G");
			break;
		case 3:
			System.out.print(hit+"�ѫ�O�P���T");
			
			break;
		case 4:
			System.out.print(hit+"�ѫ�O�P���|");
			
			break;
		case 5:
			System.out.print(hit+"�ѫ�O�P����");
			
			break;
		case 6:
			System.out.print(hit+"�ѫ�O�P����");
		
			break;
		case 0:
			System.out.print(hit+"�ѫ�O�P����");
			
			break;
		}
	} 
}
