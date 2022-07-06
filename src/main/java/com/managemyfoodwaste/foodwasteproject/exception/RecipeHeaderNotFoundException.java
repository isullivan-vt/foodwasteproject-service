package com.managemyfoodwaste.foodwasteproject.exception;

public class RecipeHeaderNotFoundException extends Exception {
    private Integer recipe_id;
    public RecipeHeaderNotFoundException(Integer recipe_id) {
        super(String.format("Recipe is not found with id : '%s'", recipe_id));
    }
}
