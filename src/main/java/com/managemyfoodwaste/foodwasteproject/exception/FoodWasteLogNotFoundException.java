package com.managemyfoodwaste.foodwasteproject.exception;

public class FoodWasteLogNotFoundException extends Exception {
    private Integer food_waste_log_id;
    public FoodWasteLogNotFoundException(Integer food_waste_log_id) {
        super(String.format("Food Waste log entry is not found with id : '%s'", food_waste_log_id));
    }
}
