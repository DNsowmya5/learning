package com.drucare.movieinfoservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drucare.movieinfoservice.model.Movies;
import com.drucare.movieinfoservice.service.MovieService;

@RestController
public class MovieController {
	@Autowired
	MovieService movieservice;
	
	@GetMapping("/Movies")
	public List<Movies> getMoviesInfo(){
		return movieservice.getMoviesInfo();
	}

}
