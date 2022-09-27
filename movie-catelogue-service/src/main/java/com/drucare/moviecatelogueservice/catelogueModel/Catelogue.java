package com.drucare.moviecatelogueservice.catelogueModel;


public class Catelogue {
	
	private String movieName;
	private String movieDescription;
	private double rating;
	public Catelogue() {
		super();
	}
	public Catelogue(String movieName, String movieDescription, double rating) {
		super();
		this.movieName = movieName;
		this.movieDescription = movieDescription;
		this.rating = rating;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieDescription() {
		return movieDescription;
	}
	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "CatelogueModel [movieName=" + movieName + ", movieDescription=" + movieDescription + ", rating="
				+ rating + "]";
	}
	
	
	

}
