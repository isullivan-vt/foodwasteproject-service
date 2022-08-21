package com.managemyfoodwaste.foodwasteproject.repository;

import com.managemyfoodwaste.foodwasteproject.model.RecipeWindow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeWindowRepository extends JpaRepository<RecipeWindow, Integer> {
    // Lists all recipe window records where record owner id and recipe id  match parameters, or record owner is null
    List<RecipeWindow> findByRecordOwnerIdAndRecipeIdOrRecordOwnerIdAndRecipeId(Long recordOwnerId, Integer recipeId, Long recordOwnerId2, Integer recipeId2);
}
