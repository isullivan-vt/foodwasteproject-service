package com.managemyfoodwaste.foodwasteproject.controller;

import com.managemyfoodwaste.foodwasteproject.exception.FoodTypeNotFoundException;
import com.managemyfoodwaste.foodwasteproject.model.FoodType;
import com.managemyfoodwaste.foodwasteproject.repository.FoodTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class FoodTypeController {

    @Autowired
    FoodTypeRepository foodTypeRepository;

    // Get All Food Types
    @GetMapping("/api/food_type")
    public List<FoodType> getAllFoodTypes() {
        return foodTypeRepository.findAll();
    }

    // Create a new Food Type
    @PostMapping("/api/food_type")
    public FoodType createFoodType(@Valid @RequestBody FoodType foodType) {
        return foodTypeRepository.save(foodType);
    }

    // Get a Single Food Type
    @GetMapping("/api/food_type/{id}")
    public FoodType getFoodTypeById(@PathVariable(value = "id") Integer food_type_id) throws FoodTypeNotFoundException {
        return foodTypeRepository.findById(food_type_id)
                .orElseThrow(() -> new FoodTypeNotFoundException(food_type_id));
    }

    // Update a Food Type
    @PutMapping("/api/food_type/{id}")
    public FoodType updateFoodType(@PathVariable(value = "id") Integer food_type_id,
                           @Valid @RequestBody FoodType foodTypeDetails) throws FoodTypeNotFoundException {

        FoodType foodType = foodTypeRepository.findById(food_type_id)
                .orElseThrow(() -> new FoodTypeNotFoundException(food_type_id));

        foodType.setFood_type_description(foodTypeDetails.getFood_type_description());
        foodType.setCreate_user_id(foodTypeDetails.getCreate_user_id());
        foodType.setCreate_timestamp(foodTypeDetails.getCreate_timestamp());
        foodType.setUpdate_user_id(foodTypeDetails.getUpdate_user_id());
        foodType.setUpdate_timestamp(foodTypeDetails.getUpdate_timestamp());
        foodType.setRecord_status(foodTypeDetails.getRecord_status());

        FoodType updatedFoodType = foodTypeRepository.save(foodType);

        return updatedFoodType;
    }

    // Delete a Food Type
    @DeleteMapping("/api/food_type/{id}")
    public ResponseEntity<?> deleteFoodType(@PathVariable(value = "id") Integer food_type_id) throws FoodTypeNotFoundException {
        FoodType foodType = foodTypeRepository.findById(food_type_id)
                .orElseThrow(() -> new FoodTypeNotFoundException(food_type_id));

        foodTypeRepository.delete(foodType);

        return ResponseEntity.ok().build();
    }
}