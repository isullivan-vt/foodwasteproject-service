package com.managemyfoodwaste.foodwasteproject.exception;

public class FoodTypeNotFoundException extends Exception {
    private Integer food_type_id;
    public FoodTypeNotFoundException(Integer food_type_id) {
        super(String.format("Food Type is not found with id : '%s'", food_type_id));
    }
}
