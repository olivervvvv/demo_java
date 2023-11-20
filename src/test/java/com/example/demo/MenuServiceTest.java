package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.example.demo.entity.Menu;
import com.example.demo.service.ifs.MenuService;

@SpringBootTest
public class MenuServiceTest {
	
	@Autowired
	private MenuService menuService;
	
	@Test
	public void addMenuTest() {
		Menu result = menuService.addMenu(new Menu("pork",null, 100));
		Assert.isTrue(result !=null, "add Error");
	}
}
