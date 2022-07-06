package com.managemyfoodwaste.foodwasteproject.exception;

public class FoodInventoryNotFoundException extends Exception {
    private Integer food_inventory_id;
    public FoodInventoryNotFoundException(Integer food_inventory_id) {
        super(String.format("Food Inventory is not found with id : '%s'", food_inventory_id));
    }
}
