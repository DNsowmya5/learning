package com.drucare.movieratingservice.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.drucare.movieratingservice.model.Rating;

@Service
public class RatingService {

	public List<Rating> getAllRatings() {

		List<Rating> ratings = new ArrayList<>(Arrays.asList(new Rating("9","101"),
				new Rating("8","102"),
				new Rating("7.9","111"),
				new Rating("8","105"),
				new Rating("8.7","104")));
		return ratings;
	}

}
