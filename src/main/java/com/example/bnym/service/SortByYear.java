package com.example.bnym.service;

import java.util.Comparator;

import com.example.bnym.entity.Movie;

public class SortByYear implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		
		return o1.getYear().compareTo(o2.getYear());
	}

}
