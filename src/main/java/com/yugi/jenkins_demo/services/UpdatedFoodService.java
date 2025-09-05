package com.yugi.jenkins_demo.services;

import com.yugi.jenkins_demo.models.food;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpdatedFoodService implements FoodServiceInterface{

    @Override
    public food createFood(food Food) {
        return null;
    }

    @Override
    public List<food> getAllFood() {
        return List.of();
    }

    @Override
    public food getFoodById(String id) {
        return null;
    }

    @Override
    public food updateFood(String id, food foodDetails) {
        return null;
    }

    @Override
    public void deleteFood(String id) {

    }
}
