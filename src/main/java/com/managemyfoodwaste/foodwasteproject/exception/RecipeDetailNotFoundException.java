package com.managemyfoodwaste.foodwasteproject.exception;

public class RecipeDetailNotFoundException extends Exception {
    private Integer recipe_detail_id;
    public RecipeDetailNotFoundException(Integer recipe_detail_id) {
        super(String.format("Recipe detail is not found with id : '%s'", recipe_detail_id));
    }
}
