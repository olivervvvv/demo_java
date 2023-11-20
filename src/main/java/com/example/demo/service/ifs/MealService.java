package com.example.demo.service.ifs;

import com.example.demo.entity.Meal;

public interface MealService {

	public Meal findByName(String name);

	public Meal addMeal(Meal mealId);

}
