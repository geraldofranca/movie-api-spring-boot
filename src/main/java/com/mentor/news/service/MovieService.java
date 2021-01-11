package com.mentor.news.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mentor.news.domain.Movie;
import com.mentor.news.repository.MovieRepository;

@Service
public class MovieService {
	@Autowired
	private MovieRepository repository;
	
	public List<Movie> findAll() {
		return repository.findAll();
	}
}
