package com.yugi.jenkins_demo.services;

import com.yugi.jenkins_demo.models.food;

import java.util.List;

public interface FoodServiceInterface {
    public food createFood(food Food);
    public List<food> getAllFood();
    public food getFoodById(String id);
    public food updateFood(String id, food foodDetails);
    public void deleteFood(String id);
}
