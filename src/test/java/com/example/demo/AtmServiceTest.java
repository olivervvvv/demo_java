package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.ifs.AtmService;
import com.example.demo.vo.AtmResponse;

@SpringBootTest
public class AtmServiceTest {

	@Autowired
	private AtmService atmService;
	
	@Test
	public void addInfoTest() {
		AtmResponse res = atmService.addInfo("faker", "ddd3434");
		System.out.println(res.getRtnCode().getCode());
		System.out.println(res.getRtnCode().getMessage());
		System.out.println(res.getAtm().getAccount());
		System.out.println(res.getAtm().getpwd());
	}
	@Test
	public void addbalanceTest() {
		AtmResponse res = atmService.despoite("faker", "ddd3434", 110);
		
	}
}
