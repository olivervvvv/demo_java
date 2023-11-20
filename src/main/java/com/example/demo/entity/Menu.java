package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.IdClass;

@Entity
@Table(name= "menu")
@IdClass(value = Meal.class)
public class Menu {
	
	@Id
	@Column(name="name")
	private String name;
	
	@Id
	@Column(name="cooking_style")
	private String cookingStyle;
	
	@Column(name="price")
	private int price;
	
	public Menu() {
		super();
	}
	
	public Menu(String name, String cookingStyle, int price) {
		super();
		this.name = name;
		this.cookingStyle = cookingStyle;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCookingStyle() {
		return cookingStyle;
	}

	public void setCooking(String cookingStyle) {
		this.cookingStyle = cookingStyle;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
