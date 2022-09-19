package com.food.menu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.food.menu.module.Food;
import com.food.menu.service.FoodService;

@RestController
public class FoodController {
	@Autowired
	FoodService foodservice;

	@GetMapping ("/menu")
	public List<Food> getAllFood(){
		return foodservice.getAllFood();
	}

	@GetMapping("/menu/{id}")
	public Food getById(@RequestBody Food food, @PathVariable String id){
		return foodservice.getById(food,id);
	}

	@PostMapping("/menu")
	public void addFood(@RequestBody Food food) {
		foodservice.addFood(food);

	}

	@PutMapping("/menu/{id}")
	public void updateFood(@RequestBody Food food, @PathVariable String id) {
		foodservice.updateFood(food,id);

	}

	@DeleteMapping("/menu/{id}")
	public void deleteFood(@PathVariable String id) {
		foodservice.deleteFood(id);

	}
}
