package com.managemyfoodwaste.foodwasteproject.repository;

import com.managemyfoodwaste.foodwasteproject.model.RecipeDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeDetailRepository extends JpaRepository<RecipeDetail, Integer> {

    List<RecipeDetail> findByRecipeId(Integer recipeId);
}
