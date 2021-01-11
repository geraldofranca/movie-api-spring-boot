package com.mentor.news.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mentor.news.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
