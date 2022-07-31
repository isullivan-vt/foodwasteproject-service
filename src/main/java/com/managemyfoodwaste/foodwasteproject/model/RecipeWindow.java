package com.managemyfoodwaste.foodwasteproject.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "recipe_window_v")
public class RecipeWindow {
    @Column(name = "recipe_id")
    private Integer recipeId;
    private Double food_quantity;
    private String unit_description;
    @Id
    private String food_description;
    private String exists_in_inventory;
    private LocalDate expiration_date;

    public RecipeWindow(){
        super();
    }
    public RecipeWindow(Integer recipeId,  Double food_quantity, String unit_description,
                        String food_description, String exists_in_inventory, LocalDate expiration_date) {
        super();
        this.recipeId = recipeId;
        this.food_quantity = food_quantity;
        this.unit_description = unit_description;
        this.food_description = food_description;
        this.exists_in_inventory = exists_in_inventory;
        this.expiration_date = expiration_date;
    }
    public Integer getRecipeId() {
        return recipeId;
    }
    public void setRecipeId(Integer recipeId) {
        this.recipeId = recipeId;
    }
    public Double getFood_quantity() {
        return food_quantity;
    }
    public void setFood_quantity(Double food_quantity) {
        this.food_quantity = food_quantity;
    }
    public String getUnit_description() {
        return unit_description;
    }
    public void setUnit_description(String unit_description) {
        this.unit_description = unit_description;
    }
    public String getFood_description() {
        return food_description;
    }
    public void setFood_description(String food_description) {
        this.food_description = food_description;
    }
    public String getExists_in_inventory() {
        return exists_in_inventory;
    }
    public void setExists_in_inventory(String exists_in_inventory) {
        this.exists_in_inventory = exists_in_inventory;
    }
    public LocalDate getExpiration_date() {
        return expiration_date;
    }
    public void setExpiration_date(LocalDate expiration_date) {
        this.expiration_date = expiration_date;
    }
}