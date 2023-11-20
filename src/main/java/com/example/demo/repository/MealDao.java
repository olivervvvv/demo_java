package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Meal;
import com.example.demo.entity.MealId;

@Repository
public interface MealDao extends JpaRepository<Meal, MealId> {
	
	public List<Meal> findTop2ByName(String name);
	
	public List<Meal> findFirst2ByName(String name);
	
	//orderBy:排序 :預設ASC
	//ASC:由小至大 DESC由大到小
	public List<Meal> findByNameOrderByPrice(String name);
	
	//public List<Meal> findAllByOrderByPriceAsc();
	public List<Meal> findAllByOrderByPrice();
	
	public List<Meal> findAllByOrderByPriceDesc();
}
