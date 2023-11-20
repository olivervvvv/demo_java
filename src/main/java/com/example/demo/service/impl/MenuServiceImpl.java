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
		// �ˬd�ƾڮw���O�_�w�s�b�㦳�ۦP�W�٪����
	    Optional<Menu> existingMenuOptional = menudao.findById(menu.getName());

	    if (existingMenuOptional.isPresent()) {
	        Menu existingMenu = existingMenuOptional.get();
	        if (existingMenu.getPrice() == menu.getPrice()) {
	            // �p�G����ۦP�A�����w�s�b�����A���i��O�s
	            return existingMenu;
	        } else {
	            // �p�G���椣�P�A�i�H��ܧ�s����
	            existingMenu.setPrice(menu.getPrice());
	            return menudao.save(existingMenu);
	        }
	    } else {
	        // �p�G���s�b�ۦP�W�٪����A�O�s�s�����
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
