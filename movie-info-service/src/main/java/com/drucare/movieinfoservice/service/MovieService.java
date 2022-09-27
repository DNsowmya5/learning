package com.drucare.movieinfoservice.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.drucare.movieinfoservice.model.Movies;

@Service
public class MovieService {

	public List<Movies> getMoviesInfo() {
		List<Movies> movies=new ArrayList<>();
		return Collections.singletonList(new Movies (101,"RRR"));

	}

}
