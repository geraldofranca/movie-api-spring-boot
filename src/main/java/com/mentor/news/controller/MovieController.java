package com.mentor.news.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mentor.news.domain.Movie;
import com.mentor.news.service.MovieService;

@RestController
@RequestMapping(value="/movie")
public class MovieController {

	@Autowired
	private MovieService service;
	
	@GetMapping
	public ResponseEntity<List<Movie>> findAll() {
		List<Movie> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
}
