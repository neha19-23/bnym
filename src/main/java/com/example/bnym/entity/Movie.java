package com.example.bnym.entity;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Movie implements Comparable<Movie>{

	String name;
	Integer rating;
	Integer year;
	
	public Movie(String name,Integer rating,Integer year)
	{
		this.name=name;
		this.rating=rating;
		this.year=year;
	}
	
	public String getName()
	{
		return this.name;
	}

	public Integer getRating() {
		return rating;
	}

	public Integer getYear() {
		return year;
	}

	@Override
	public int compareTo(Movie o) {
		if(this.year > o.getYear())
			return 1;
		if(this.year < o.getYear())
			return -1;
		return 0;
	}
	
}
