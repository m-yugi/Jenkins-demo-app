package com.yugi.jenkins_demo.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.yugi.jenkins_demo.models.food;

@Repository
// FoodDao --> can also be named as FoodRepository
public interface FoodDao extends MongoRepository<food, String> {

}
