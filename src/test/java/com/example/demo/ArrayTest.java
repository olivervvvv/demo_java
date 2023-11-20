package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ArrayTest {
	@Test
	public void array() {
		Scanner scan = new Scanner(System.in);
		int size=5;
		int[] i= new int[size];
		int x=0;
		while(scan.hasNext()) {
			i[x]=scan.nextInt();
			System.out.printf("%d ",i[x]);
			x++;
			if(x>=4)size++;
			i= new int[size];
		}
		
		
	}
}
