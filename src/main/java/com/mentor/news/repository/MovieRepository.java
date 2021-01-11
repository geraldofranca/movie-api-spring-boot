package com.mentor.news.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mentor.news.domain.Movie;

public interface MovieRepository extends MongoRepository<Movie, String>{

}
