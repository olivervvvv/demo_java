package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class regexpTest {
	@Test
	public void reTest() {
		String str = "0912-341-123";
		String pattern ="\\d{4}(-\\d{3}){2}";
		System.out.print(str.matches(pattern));
	}
	@Test
	public void regexTest() {
		String pattern = "[A-za-z&&[^ABDEFHabcdefh]][1-2]\\d{8}";
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.print(str.matches(pattern));
	}

}
