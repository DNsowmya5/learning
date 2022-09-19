package com.food.menu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.menu.module.Food;
import com.food.menu.repository.FoodRepository;
@Service
public class FoodService {
@Autowired
	FoodRepository foodrepository;

	public List<Food> getAllFood() {
		List<Food> foods=new ArrayList<>();
		foodrepository.findAll().forEach(foods::add);
		return foods;
	}

	public Food getById(Food food, String foodid) {
		
		return foodrepository.findById(foodid).get();
	}

	public void addFood(Food food) {
		foodrepository.save(food);
		
	}

	public void updateFood(Food food, String id) {
		foodrepository.save(food);
		
	}

	public void deleteFood(String id) {
		foodrepository.deleteById(id);
		}
}
