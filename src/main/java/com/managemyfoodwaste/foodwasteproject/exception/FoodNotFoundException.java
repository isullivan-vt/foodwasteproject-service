package com.managemyfoodwaste.foodwasteproject.exception;

public class FoodNotFoundException extends Exception {
    private Integer food_id;
    public FoodNotFoundException(Integer food_id) {
        super(String.format("Food is not found with id : '%s'", food_id));
    }
}
