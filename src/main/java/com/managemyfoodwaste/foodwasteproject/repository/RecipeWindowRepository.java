package com.managemyfoodwaste.foodwasteproject.repository;

import com.managemyfoodwaste.foodwasteproject.model.RecipeWindow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeWindowRepository extends JpaRepository<RecipeWindow, Integer> {

    List<RecipeWindow> findByRecipeId(Integer recipeId);
}
