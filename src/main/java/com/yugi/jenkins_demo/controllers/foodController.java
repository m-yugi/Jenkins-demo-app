package com.yugi.jenkins_demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.yugi.jenkins_demo.services.foodService;

import lombok.AllArgsConstructor;

import com.yugi.jenkins_demo.models.food;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foods")
public class foodController {

    private foodService foodService;

    @PostMapping("/")
    public ResponseEntity<food> createFood(@RequestBody food Food) {
        System.out.println("hello");
        return ResponseEntity.ok(foodService.createFood(Food));
    }

    @GetMapping("/")
    public ResponseEntity<List<food>> getAllFoods() {
        return ResponseEntity.ok(foodService.getAllFood());
    }

    @GetMapping("/{id}")
    public ResponseEntity<food> getFoodById(@PathVariable String id) {
        return ResponseEntity.ok(foodService.getFoodById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<food> updateFood(@PathVariable String id, @RequestBody food Food) {
        return ResponseEntity.ok(foodService.updateFood(id, Food));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFood(@PathVariable String id) {
        foodService.deleteFood(id);
        return ResponseEntity.ok().build();
    }
}
