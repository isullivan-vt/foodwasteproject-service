package com.managemyfoodwaste.foodwasteproject.controller;

import com.managemyfoodwaste.foodwasteproject.exception.FoodInventoryNotFoundException;
import com.managemyfoodwaste.foodwasteproject.model.FoodInventory;
import com.managemyfoodwaste.foodwasteproject.repository.FoodInventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class FoodInventoryController {

    @Autowired
    FoodInventoryRepository foodInventoryRepository;

    // Get All Food Inventory
    @GetMapping("/food_inventory")
    public List<FoodInventory> getAllFoodInventories() {
        return foodInventoryRepository.findAll();
    }

    // Create a new Food Inventory
    @PostMapping("/food_inventory")
    public FoodInventory createFoodInventory(@Valid @RequestBody FoodInventory foodInventory) {
        return foodInventoryRepository.save(foodInventory);
    }

    // Get a Single Food Inventory
    @GetMapping("/food_inventory/{id}")
    public FoodInventory getFoodInventoryById(@PathVariable(value = "id") Integer food_inventory_id) throws FoodInventoryNotFoundException {
        return foodInventoryRepository.findById(food_inventory_id)
                .orElseThrow(() -> new FoodInventoryNotFoundException(food_inventory_id));
    }

    // Update a Food Inventory
    @PutMapping("/food_inventory/{id}")
    public FoodInventory updateFoodInventory(@PathVariable(value = "id") Integer food_inventory_id,
                           @Valid @RequestBody FoodInventory foodInventoryDetails) throws FoodInventoryNotFoundException {

        FoodInventory foodInventory = foodInventoryRepository.findById(food_inventory_id)
                .orElseThrow(() -> new FoodInventoryNotFoundException(food_inventory_id));

        foodInventory.setFood_id(foodInventoryDetails.getFood_id());
        foodInventory.setFood_quantity(foodInventoryDetails.getFood_quantity());
        foodInventory.setFood_acquisition_date(foodInventoryDetails.getFood_acquisition_date());
        foodInventory.setFood_cost_usd(foodInventoryDetails.getFood_cost_usd());
        foodInventory.setNotes(foodInventoryDetails.getNotes());
        foodInventory.setCreate_user_id(foodInventoryDetails.getCreate_user_id());
        foodInventory.setCreate_timestamp(foodInventoryDetails.getCreate_timestamp());
        foodInventory.setUpdate_user_id(foodInventoryDetails.getUpdate_user_id());
        foodInventory.setUpdate_timestamp(foodInventoryDetails.getUpdate_timestamp());
        foodInventory.setRecord_status(foodInventoryDetails.getRecord_status());

        FoodInventory updatedFoodInventory = foodInventoryRepository.save(foodInventory);

        return updatedFoodInventory;
    }

    // Delete a Food Inventory
    @DeleteMapping("/food_inventory/{id}")
    public ResponseEntity<?> deleteFoodInventory(@PathVariable(value = "id") Integer food_inventory_id) throws FoodInventoryNotFoundException {
        FoodInventory foodInventory = foodInventoryRepository.findById(food_inventory_id)
                .orElseThrow(() -> new FoodInventoryNotFoundException(food_inventory_id));

        foodInventoryRepository.delete(foodInventory);

        return ResponseEntity.ok().build();
    }
}