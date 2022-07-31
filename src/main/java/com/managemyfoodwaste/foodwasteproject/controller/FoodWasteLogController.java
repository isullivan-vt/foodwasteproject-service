package com.managemyfoodwaste.foodwasteproject.controller;

import com.managemyfoodwaste.foodwasteproject.exception.FoodWasteLogNotFoundException;
import com.managemyfoodwaste.foodwasteproject.model.FoodWasteLog;
import com.managemyfoodwaste.foodwasteproject.repository.FoodWasteLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class FoodWasteLogController {

    @Autowired
    FoodWasteLogRepository foodWasteLogRepository;

    // Get All Food Waste Log
    @GetMapping("/api/food_waste_log")
    public List<FoodWasteLog> getAllFoodWasteLogs() {
        return foodWasteLogRepository.findAll();
    }

    // Create a new Food Waste Log
    @PostMapping("/api/food_waste_log")
    public FoodWasteLog createFoodWasteLog(@Valid @RequestBody FoodWasteLog foodWasteLog) {
        return foodWasteLogRepository.save(foodWasteLog);
    }

    // Get a Single Food Waste Log
    @GetMapping("/api/food_waste_log/{id}")
    public FoodWasteLog getFoodWasteLogById(@PathVariable(value = "id") Integer food_waste_log_id) throws FoodWasteLogNotFoundException {
        return foodWasteLogRepository.findById(food_waste_log_id)
                .orElseThrow(() -> new FoodWasteLogNotFoundException(food_waste_log_id));
    }

    // Update a Food Waste Log
    @PutMapping("/api/food_waste_log/{id}")
    public FoodWasteLog updateWasteLogInventory(@PathVariable(value = "id") Integer food_waste_log_id,
                           @Valid @RequestBody FoodWasteLog foodWasteLogDetails) throws FoodWasteLogNotFoundException {

        FoodWasteLog foodWasteLog = foodWasteLogRepository.findById(food_waste_log_id)
                .orElseThrow(() -> new FoodWasteLogNotFoundException(food_waste_log_id));

        foodWasteLog.setFood_id(foodWasteLogDetails.getFood_id());
        foodWasteLog.setFood_quantity(foodWasteLogDetails.getFood_quantity());
        foodWasteLog.setFood_quantity_unit_id(foodWasteLogDetails.getFood_quantity_unit_id());
        foodWasteLog.setFood_expiration_date(foodWasteLogDetails.getFood_expiration_date());
        foodWasteLog.setNotes(foodWasteLogDetails.getNotes());
        foodWasteLog.setCreate_user_id(foodWasteLogDetails.getCreate_user_id());
        foodWasteLog.setCreate_timestamp(foodWasteLogDetails.getCreate_timestamp());
        foodWasteLog.setUpdate_user_id(foodWasteLogDetails.getUpdate_user_id());
        foodWasteLog.setUpdate_timestamp(foodWasteLogDetails.getUpdate_timestamp());
        foodWasteLog.setRecord_status(foodWasteLogDetails.getRecord_status());

        FoodWasteLog updatedFoodWasteLog = foodWasteLogRepository.save(foodWasteLog);

        return updatedFoodWasteLog;
    }

    // Delete a Food Waste Log
    @DeleteMapping("/api/food_waste_log/{id}")
    public ResponseEntity<?> deleteFoodWasteLog(@PathVariable(value = "id") Integer food_waste_log_id) throws FoodWasteLogNotFoundException {
        FoodWasteLog foodWasteLog = foodWasteLogRepository.findById(food_waste_log_id)
                .orElseThrow(() -> new FoodWasteLogNotFoundException(food_waste_log_id));

        foodWasteLogRepository.delete(foodWasteLog);

        return ResponseEntity.ok().build();
    }
}