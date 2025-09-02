package com.yugi.jenkins_demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yugi.jenkins_demo.Dao.FoodDao;
import com.yugi.jenkins_demo.models.food;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class foodService {
    private static final String FOOD_NOT_FOUND_STRING = "Food not found with id: ";
    private FoodDao foodRepository;

    public food createFood(food food) {
        return foodRepository.save(food);
    }

    public List<food> getAllFood() {
        return foodRepository.findAll();
    }

    public food getFoodById(String id) {
        System.out.println(id);
        return foodRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(FOOD_NOT_FOUND_STRING + id));
    }

    public food updateFood(String id, food foodDetails) {
        food food = foodRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(FOOD_NOT_FOUND_STRING + id));

        food.setName(foodDetails.getName());
        food.setDescription(foodDetails.getDescription());
        food.setPrice(foodDetails.getPrice());

        return foodRepository.save(food);
    }

    public void deleteFood(String id) {
        food food = foodRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(FOOD_NOT_FOUND_STRING + id));

        foodRepository.delete(food);
    }
}
