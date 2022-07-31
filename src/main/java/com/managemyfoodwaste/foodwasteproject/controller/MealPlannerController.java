package com.managemyfoodwaste.foodwasteproject.controller;

import com.managemyfoodwaste.foodwasteproject.model.MealPlanner;
import com.managemyfoodwaste.foodwasteproject.repository.MealPlannerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MealPlannerController {

    @Autowired
    MealPlannerRepository mealPlannerRepository;

    // Get All Meal Plan Recipe Items
    @GetMapping("/api/meal-planner")
    public List<MealPlanner> getAllMealPlanner() {
        return mealPlannerRepository.findAll();
    }

}