package com.example.bnym.controller;

import java.util.HashMap;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bnym.entity.Movie;
import com.example.bnym.entity.ResponsePojo;
import com.example.bnym.service.movieService;

@RestController
@RequestMapping("/api")
public class APIController {
	
	@Autowired
	movieService mv;
	
	@GetMapping("/sortMovie")
	public List<Movie> getSortedMovie()
	{
		return mv.getSortedMovie();
	}
	
	@GetMapping("/products")
	public ResponsePojo getProduct()
	{
		ResponsePojo rs = new ResponsePojo();
		try {
			rs.setErrorCode(0);
			rs.setErrorMessage("SUCCESS");
			rs.setData(mv.getProducts());
		
		}catch(Exception e)
		{
			rs.setErrorCode(400);
			rs.setErrorMessage("FAILURE");
			rs.setData(new HashMap<>());
			
		}
		return rs;
	}

}
