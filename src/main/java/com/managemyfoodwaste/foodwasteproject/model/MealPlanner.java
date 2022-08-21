package com.managemyfoodwaste.foodwasteproject.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Table(name = "meal_planner_v")
public class MealPlanner {
    // Define Data Fields
    @Id
    private Integer recipe_id;
    @NotBlank
    private String recipe_name;
    private Integer ingredient_count;
    private String recipe_content;

    public MealPlanner(){
        super();
    }
    // Constructor
    public MealPlanner(Integer recipe_id, String recipe_name, Integer ingredient_count, String recipe_content) {
        super();
        this.recipe_id = recipe_id;
        this.recipe_name = recipe_name;
        this.ingredient_count = ingredient_count;
        this.recipe_content = recipe_content;
    }
    // Getter/Setter Methods
    public Integer getRecipe_id() {
        return recipe_id;
    }
    public void setRecipe_id(Integer recipe_id) {
        this.recipe_id = recipe_id;
    }
    public String getRecipe_name() {
        return recipe_name;
    }
    public void setRecipe_name(String recipe_name) {
        this.recipe_name = recipe_name;
    }
    public Integer getIngredient_count() {
        return ingredient_count;
    }
    public void setIngredient_count(Integer ingredient_count) {
        this.ingredient_count = ingredient_count;
    }
    public String getRecipe_content() {
        return recipe_content;
    }
    public void setRecipe_content(String recipe_content) {
        this.recipe_content = recipe_content;
    }

}