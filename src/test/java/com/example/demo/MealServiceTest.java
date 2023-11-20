package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.example.demo.entity.Meal;
import com.example.demo.entity.MealId;
import com.example.demo.repository.MealDao;
import com.example.demo.service.ifs.MealService;

@SpringBootTest
public class MealServiceTest {

	@Autowired
	private MealService mealService;
    
    @Autowired
    private MealDao mealDao;
    
    @Test
    public void addMeal() {
    	mealService.addMeal(new Meal("chicken","steam",520));
    	mealService.addMeal(new Meal("chicken","cook",220));
    	mealService.addMeal(new Meal("chicken","BBQ",320));
    }
    
    @Test
    public void addMealTest() {
    	//ぃ才兵ン
        Meal result = mealService.addMeal(new Meal("", "BBQ", 120));
        Assert.isTrue(result==null,"addMeal Error");
        //cooking_style ぃ才
        result = mealService.addMeal(new Meal("beef", "BBQ", 120));
        Assert.isTrue(result!=null,"addMeal Error");
        //priceぃ才
        result = mealService.addMeal(new Meal("beef", "BBQ", 0));
//        Assert.isTrue(result!=null,"addMeal Error");
        //タ盽穝糤
        result = mealService.addMeal(new Meal("pork", "BBQ", 140));
//        Assert.isTrue(result==null,"addMeal Error");
        //穝糤meal
        result = mealService.addMeal(new Meal("beef", "BBQ", 180));
//        Assert.isTrue(result!=null,"addMeal Error");
        //埃代刚戈
        mealDao.deleteById(new MealId("beef", "BBQ"));
    }

    @Test
    public void addMealTest1() {
    	mealService.addMeal(new Meal("beef", "BBQ", 120));
//    	mealIdService.addMealId(new MealId("", "BBQ", 0));
//    	mealIdService.addMealId(new MealId("", "BBQ", 0));
//    	mealIdService.addMealId(new MealId("", "BBQ", 0));
//    	mealIdService.addMealId(new MealId("", "BBQ", 0));
    }
    @Test
    public void limitTest() {
    	List<Meal> res = mealDao.findFirst2ByName("chicken");
    	System.out.println(res.size());
    	Assert.isTrue(res.size() == 2,"find_limit_error!!");
    	
    }
    @Test
    public void orderByTest() {
//    	List<Meal> res = mealDao.findByNameOrderByPrice("chicken");
    	List<Meal> res = mealDao.findAllByOrderByPrice();
    	for(Meal item: res) {
    		System.out.println(item.getName()+item.getCookingStyle()+": "+item.getPrice());
    	}
    }

}
