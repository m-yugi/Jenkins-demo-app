package com.yugi.jenkins_demo.controllers;

import com.yugi.jenkins_demo.Dao.FoodDao;
import com.yugi.jenkins_demo.services.FoodServiceInterface;
import com.yugi.jenkins_demo.services.UpdatedFoodService;
import org.springframework.web.bind.annotation.RestController;

import com.yugi.jenkins_demo.services.foodService;

import lombok.AllArgsConstructor;

import com.yugi.jenkins_demo.models.food;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foods")
/*
URL --> GET localhost:8080/foods/
        POST localhost:8080/foods/
        GET localhost:8080/foods/1
*/
public class foodController {

    private FoodServiceInterface foodService;

    @PostMapping("/") //-->HTTP POST
    public ResponseEntity<food> createFood(@RequestBody food Food) {
        System.out.println(Food);
        return ResponseEntity.ok(foodService.createFood(Food));
    }

    @GetMapping("/") //-->HTTP GET
    public ResponseEntity<List<food>> getAllFoods() {
        return ResponseEntity.ok(foodService.getAllFood());
    }

    @GetMapping("/{id}")
    public ResponseEntity<food> getFoodById(@PathVariable String id) {
        return ResponseEntity.ok(foodService.getFoodById(id));
    }

    @PutMapping("/{id}") //HTTP PUT
    public ResponseEntity<food> updateFood(@PathVariable String id, @RequestBody food Food) {
        return ResponseEntity.ok(foodService.updateFood(id, Food));
    }

    @DeleteMapping("/{id}") // HTTP DELETE
    public ResponseEntity<Void> deleteFood(@PathVariable String id) {
        foodService.deleteFood(id);
        return ResponseEntity.ok().build();
    }
}

//frontend --> we will get a request from the frontend and send it to the backend
// when the request comes the first place that request goes to is the controller
// frontend will send request to yugi.com:8080/foods/
// controller will receive the request at foodcontroller.java
// controller will send the request to createFood method in foodservice.java
// foodservice will call the foodRepository.save method to save the food object
//foodRepository.save method will save the food object in the database using the food entity
// frontend --> controller --> service --> repository --> database --> we will get the same data back if it get's saved successfully