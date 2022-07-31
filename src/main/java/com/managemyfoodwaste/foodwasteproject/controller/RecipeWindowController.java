package com.managemyfoodwaste.foodwasteproject.controller;

import com.managemyfoodwaste.foodwasteproject.model.RecipeWindow;
import com.managemyfoodwaste.foodwasteproject.repository.RecipeWindowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class RecipeWindowController {

    @Autowired
    RecipeWindowRepository recipeWindowRepository;

    // Get All Recipe Detail for a recipe
    @GetMapping("/api/recipe_window/{recipeId}")
    public List<RecipeWindow> getAllRecipeWindowRecordsByRecipe(@PathVariable(value = "recipeId") Integer recipeId) {
        return recipeWindowRepository.findByRecipeId(recipeId);
    }
}