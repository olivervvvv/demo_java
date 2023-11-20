package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void firstTest() {
		int x,t=0;
		char y[]= {
				'1','2','3','4','5'
		};
		int z[]= {1,2,3,4,5};
		for(x=0;x<5;x++) {
			//System.out.println(y[x]);
			t+=z[x];
			System.out.println(t);
		}
	}
}
