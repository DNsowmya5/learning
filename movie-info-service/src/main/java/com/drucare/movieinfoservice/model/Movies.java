package com.drucare.movieinfoservice.model;

public class Movies {

	private int id;
	private String movieName;
		public Movies() {
		super();
	}
		
		public Movies(int id, String movieName) {
			super();
			this.id = id;
			this.movieName = movieName;
		}

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getMovieName() {
			return movieName;
		}
		public void setMovieName(String movieName) {
			this.movieName = movieName;
		}

		@Override
		public String toString() {
			return "Movies [id=" + id + ", movieName=" + movieName + "]";
		}
	
	
	
}
