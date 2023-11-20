package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.entity.Menu;
import com.example.demo.repository.MenuDao;
import com.example.demo.service.ifs.MenuService;


@Service
public class MenuServiceImpl implements MenuService{

	//@: annotaion
	@Autowired
	private MenuDao menudao;
	
	@Override
	public Menu addMenu(Menu menu) {
		if(!StringUtils.hasText(menu.getName())||menu.getPrice()<=0 ) {
			return null;
		}
		// 檢查數據庫中是否已存在具有相同名稱的菜單
	    Optional<Menu> existingMenuOptional = menudao.findById(menu.getName());

	    if (existingMenuOptional.isPresent()) {
	        Menu existingMenu = existingMenuOptional.get();
	        if (existingMenu.getPrice() == menu.getPrice()) {
	            // 如果價格相同，視為已存在的菜單，不進行保存
	            return existingMenu;
	        } else {
	            // 如果價格不同，可以選擇更新價格
	            existingMenu.setPrice(menu.getPrice());
	            return menudao.save(existingMenu);
	        }
	    } else {
	        // 如果不存在相同名稱的菜單，保存新的菜單
	        return menudao.save(menu);
	    }
	}

	@Override
	public List<Menu> addMenu(List<Menu> menuList) {
		for(Menu item : menuList) {
			if(!StringUtils.hasText(item.getName())||item.getPrice()<=0) {
				return null;
			}
		}
		return menudao.saveAll(menuList);
		
	}

	@Override
	public Menu updateMenu(Menu menu) {
		if(!StringUtils.hasText(menu.getName()) || menu.getPrice()<=0) {
			return null;
		}
		if(!menudao.existsById(menu.getName())) {
			return null;			
		}
		return menudao.save(menu);
	}

	@Override
	public Menu findByName(String name) {
		if(!StringUtils.hasText(name)){
			return null;
		}
		Optional<Menu> op = menudao.findById(name);
		return op.isEmpty() ? null:op.get();
//		return op.orElseGet(null);
	}

	@Override
	public List<Menu> findAll() {
		return menudao.findAll();
		
	}
	
}
