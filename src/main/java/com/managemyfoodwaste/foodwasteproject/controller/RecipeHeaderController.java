package com.managemyfoodwaste.foodwasteproject.controller;

import com.managemyfoodwaste.foodwasteproject.exception.RecipeHeaderNotFoundException;
import com.managemyfoodwaste.foodwasteproject.model.RecipeHeader;
import com.managemyfoodwaste.foodwasteproject.repository.RecipeHeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class RecipeHeaderController {

    @Autowired
    RecipeHeaderRepository recipeHeaderRepository;

    // Get All Recipe Header
    @GetMapping("/recipe_header")
    public List<RecipeHeader> getAllUnits() {
        return recipeHeaderRepository.findAll();
    }

    // Create a new Recipe Header
    @PostMapping("/recipe_header")
    public RecipeHeader createRecipeHeader(@Valid @RequestBody RecipeHeader recipeHeader) {
        return recipeHeaderRepository.save(recipeHeader);
    }

    // Get a Single Recipe Header
    @GetMapping("/recipe_header/{id}")
    public RecipeHeader getRecipeHeaderById(@PathVariable(value = "id") Integer recipe_id) throws RecipeHeaderNotFoundException {
        return recipeHeaderRepository.findById(recipe_id)
                .orElseThrow(() -> new RecipeHeaderNotFoundException(recipe_id));
    }

    // Update a Recipe Header
    @PutMapping("/recipe_header/{id}")
    public RecipeHeader updateRecipeHeader(@PathVariable(value = "id") Integer recipe_id,
                           @Valid @RequestBody RecipeHeader recipeHeaderDetails) throws RecipeHeaderNotFoundException {

        RecipeHeader recipeHeader = recipeHeaderRepository.findById(recipe_id)
                .orElseThrow(() -> new RecipeHeaderNotFoundException(recipe_id));

        recipeHeader.setRecipe_name(recipeHeaderDetails.getRecipe_name());
        recipeHeader.setRecipe_content(recipeHeaderDetails.getRecipe_content());
        recipeHeader.setRecipe_user_notes(recipeHeaderDetails.getRecipe_user_notes());
        recipeHeader.setCreate_user_id(recipeHeaderDetails.getCreate_user_id());
        recipeHeader.setCreate_timestamp(recipeHeaderDetails.getCreate_timestamp());
        recipeHeader.setUpdate_user_id(recipeHeaderDetails.getUpdate_user_id());
        recipeHeader.setUpdate_timestamp(recipeHeaderDetails.getUpdate_timestamp());
        recipeHeader.setRecord_status(recipeHeaderDetails.getRecord_status());

        RecipeHeader updatedRecipeHeader = recipeHeaderRepository.save(recipeHeader);

        return updatedRecipeHeader;
    }

    // Delete a Recipe Header
    @DeleteMapping("/recipe_header/{id}")
    public ResponseEntity<?> deleteRecipeHeader(@PathVariable(value = "id") Integer recipe_id) throws RecipeHeaderNotFoundException {
        RecipeHeader recipeHeader = recipeHeaderRepository.findById(recipe_id)
                .orElseThrow(() -> new RecipeHeaderNotFoundException(recipe_id));

        recipeHeaderRepository.delete(recipeHeader);

        return ResponseEntity.ok().build();
    }
}