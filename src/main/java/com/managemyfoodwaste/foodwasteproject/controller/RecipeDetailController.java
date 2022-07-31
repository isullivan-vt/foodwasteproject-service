package com.managemyfoodwaste.foodwasteproject.controller;

import com.managemyfoodwaste.foodwasteproject.exception.RecipeDetailNotFoundException;
import com.managemyfoodwaste.foodwasteproject.model.RecipeDetail;
import com.managemyfoodwaste.foodwasteproject.repository.RecipeDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class RecipeDetailController {

    @Autowired
    RecipeDetailRepository recipeDetailRepository;

    // Get All Recipe Detail
    @GetMapping("/api/recipe_detail")
    public List<RecipeDetail> getAllRecipeDetails() {
        return recipeDetailRepository.findAll();
    }

    // Get All Recipe Detail for a recipe
    @GetMapping("/api/recipe_details/{recipeId}")
    public List<RecipeDetail> getAllRecipeDetailsByRecipe(@PathVariable(value = "recipeId") Integer recipeId) {
        return recipeDetailRepository.findByRecipeId(recipeId);
    }


    // Create a new Recipe Detail
    @PostMapping("/api/recipe_detail")
    public RecipeDetail createRecipeDetail(@Valid @RequestBody RecipeDetail recipeDetail) {
        return recipeDetailRepository.save(recipeDetail);
    }

    // Get a Single Recipe Detail
    @GetMapping("/api/recipe_detail/{id}")
    public RecipeDetail getRecipeDetailById(@PathVariable(value = "id") Integer recipe_detail_id) throws RecipeDetailNotFoundException {
        return recipeDetailRepository.findById(recipe_detail_id)
                .orElseThrow(() -> new RecipeDetailNotFoundException(recipe_detail_id));
    }

    // Update a Recipe Detail
    @PutMapping("/api/recipe_detail/{id}")
    public RecipeDetail updateRecipeDetail(@PathVariable(value = "id") Integer recipe_detail_id,
                           @Valid @RequestBody RecipeDetail recipeDetailDetails) throws RecipeDetailNotFoundException {

        RecipeDetail recipeDetail = recipeDetailRepository.findById(recipe_detail_id)
                .orElseThrow(() -> new RecipeDetailNotFoundException(recipe_detail_id));

        recipeDetail.setFood_id(recipeDetailDetails.getFood_id());
        recipeDetail.setRecipeId(recipeDetailDetails.getRecipeId());
        recipeDetail.setFood_quantity(recipeDetailDetails.getFood_quantity());
        recipeDetail.setFood_quantity_unit_id(recipeDetailDetails.getFood_quantity_unit_id());
        recipeDetail.setCreate_user_id(recipeDetailDetails.getCreate_user_id());
        recipeDetail.setCreate_timestamp(recipeDetailDetails.getCreate_timestamp());
        recipeDetail.setUpdate_user_id(recipeDetailDetails.getUpdate_user_id());
        recipeDetail.setUpdate_timestamp(recipeDetailDetails.getUpdate_timestamp());
        recipeDetail.setRecord_status(recipeDetailDetails.getRecord_status());

        RecipeDetail updatedRecipeDetail = recipeDetailRepository.save(recipeDetail);

        return updatedRecipeDetail;
    }

    // Delete a Recipe Detail
    @DeleteMapping("/api/recipe_detail/{id}")
    public ResponseEntity<?> deleteRecipeDetail(@PathVariable(value = "id") Integer recipe_detail_id) throws RecipeDetailNotFoundException {
        RecipeDetail recipeDetail = recipeDetailRepository.findById(recipe_detail_id)
                .orElseThrow(() -> new RecipeDetailNotFoundException(recipe_detail_id));

        recipeDetailRepository.delete(recipeDetail);

        return ResponseEntity.ok().build();
    }
}