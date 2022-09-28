package com.drucare.movieratingservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drucare.movieratingservice.model.Rating;
import com.drucare.movieratingservice.service.RatingService;

@RestController
public class RatingController {

	@Autowired
	RatingService ratingservice;
	
	@GetMapping("/rating")
	public List<Rating> getAllRatings() {
		
		return ratingservice.getAllRatings();
	}
}
