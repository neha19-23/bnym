package com.example.bnym.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.example.bnym.entity.Movie;
import com.example.bnym.entity.Product;
import com.google.gson.Gson;

@Service
public class movieService {

	public List<Movie> getSortedMovie()
	{
		List<Movie> lst= new ArrayList<>();
		lst.add(new Movie("Movie1", 2, 2002));
		lst.add(new Movie("Movie3", 4, 1972));
		lst.add(new Movie("Movie5", 1, 2020));
		lst.add(new Movie("Movie4", 3, 2013));
		lst.add(new Movie("Movie6", 1, 1985));
		lst.add(new Movie("Movie2", 5, 1999));
		Collections.sort(lst);
		return lst;
	}
	
	public Map<String,List<String>> getProducts()
	{
		 Map<String,List<String>> str = new HashMap<String, List<String>>();
		List<Product> lst= new ArrayList<>();
		lst.add(new Product("Veg", "Onion", 30));
		lst.add(new Product("Veg", "Tomato", 45));
		lst.add(new Product("Veg", "Carrot", 60));
		lst.add(new Product("Fruits", "Apple", 150));
		lst.add(new Product("Fruits", "Orange", 80));
		lst.add(new Product("Fruits", "Banana", 70));
		lst.add(new Product("Dairy", "Milk", 25));
		lst.add(new Product("Dairy", "Butter", 42));
		lst.add(new Product("Dairy", "Curd", 10));
		
		Map<String,List<Product>> mp = lst.stream().collect(Collectors.groupingByConcurrent(Product::getCategory));
		
		for(Map.Entry<String, List<Product>> mp1: mp.entrySet())
		{
			str.put(mp1.getKey(), mp1.getValue().stream().map(Product::getItem).collect(Collectors.toList()));
		}
		return str;
	}
}
