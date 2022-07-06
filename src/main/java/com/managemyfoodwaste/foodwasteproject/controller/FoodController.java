package com.managemyfoodwaste.foodwasteproject.controller;

import com.managemyfoodwaste.foodwasteproject.exception.FoodNotFoundException;
import com.managemyfoodwaste.foodwasteproject.model.Food;
import com.managemyfoodwaste.foodwasteproject.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class FoodController {

    @Autowired
    FoodRepository foodRepository;

    // Get All Food
    @GetMapping("/food")
    public List<Food> getAllFoods() {
        return foodRepository.findAll();
    }

    // Create a new Food
    @PostMapping("/food")
    public Food createFood(@Valid @RequestBody Food food) {
        return foodRepository.save(food);
    }

    // Get a Single Food
    @GetMapping("/food/{id}")
    public Food getFoodById(@PathVariable(value = "id") Integer food_id) throws FoodNotFoundException {
        return foodRepository.findById(food_id)
                .orElseThrow(() -> new FoodNotFoundException(food_id));
    }

    // Update a Food
    @PutMapping("/food/{id}")
    public Food updateFood(@PathVariable(value = "id") Integer food_id,
                           @Valid @RequestBody Food foodDetails) throws FoodNotFoundException {

        Food food = foodRepository.findById(food_id)
                .orElseThrow(() -> new FoodNotFoundException(food_id));

        food.setFood_description(foodDetails.getFood_description());
        food.setFood_type_id(foodDetails.getFood_type_id());
        food.setFood_shelf_life_days(foodDetails.getFood_shelf_life_days());
        food.setUnit_type_id(foodDetails.getUnit_type_id());
        food.setCreate_user_id(foodDetails.getCreate_user_id());
        food.setCreate_timestamp(foodDetails.getCreate_timestamp());
        food.setUpdate_user_id(foodDetails.getUpdate_user_id());
        food.setUpdate_timestamp(foodDetails.getUpdate_timestamp());
        food.setRecord_status(foodDetails.getRecord_status());

        Food updatedFood = foodRepository.save(food);

        return updatedFood;
    }

    // Delete a Food
    @DeleteMapping("/food/{id}")
    public ResponseEntity<?> deleteFood(@PathVariable(value = "id") Integer food_id) throws FoodNotFoundException {
        Food food = foodRepository.findById(food_id)
                .orElseThrow(() -> new FoodNotFoundException(food_id));

        foodRepository.delete(food);

        return ResponseEntity.ok().build();
    }
}