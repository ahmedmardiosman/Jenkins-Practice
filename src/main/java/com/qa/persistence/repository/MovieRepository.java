package com.qa.persistence.repository;

public interface MovieRepository {

	String getAllMovies();

	String addMovie(String movie);
	
	String getMovie(Long id);

	String deleteMovie(Long id);

}
