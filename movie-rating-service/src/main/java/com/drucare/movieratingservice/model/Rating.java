package com.drucare.movieratingservice.model;

public class Rating {
	
	private String rating;
	private String id;
	
	public Rating() {
		super();
	}

	public Rating(String rating, String id) {
		
		this.rating=rating;
		this.id=id;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
