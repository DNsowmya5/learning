package com.food.menu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.food.menu.module.Food;
@Repository
public interface FoodRepository extends CrudRepository<Food, String> {

}
