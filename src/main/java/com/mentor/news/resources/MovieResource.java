package com.mentor.news.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mentor.news.domain.Movie;
import com.mentor.news.services.MovieService;

@RestController
@RequestMapping(value="/movie")
public class MovieResource {

	@Autowired
	private MovieService service;
	
	@GetMapping
	public ResponseEntity<List<Movie>> findAll() {
		List<Movie> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
}
