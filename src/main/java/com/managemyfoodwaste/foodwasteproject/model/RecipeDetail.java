package com.managemyfoodwaste.foodwasteproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@Table(name = "recipe_detil")
public class RecipeDetail {
    @Id
    @GeneratedValue
    private Integer recipe_detail_id;
    private Integer recipe_id;
    private Integer food_id;
    private Double food_quantity;
    private Integer food_quantity_unit_id;
    private Long create_user_id;
    private LocalDateTime create_timestamp;
    private Long update_user_id;
    private LocalDateTime update_timestamp;
    @NotBlank
    private String record_status;

    public RecipeDetail(){
        super();
    }
    public RecipeDetail(Integer recipe_detail_id, Integer recipe_id, Integer food_id, Double food_quantity,
                        Integer food_quantity_unit_id,
                        Long create_user_id, LocalDateTime create_timestamp, Long update_user_id,
                        LocalDateTime update_timestamp, String record_status) {
        super();
        this.recipe_detail_id = recipe_detail_id;
        this.recipe_id = recipe_id;
        this.food_id = food_id;
        this.food_quantity = food_quantity;
        this.food_quantity_unit_id = food_quantity_unit_id;
        this.create_user_id = create_user_id;
        this.create_timestamp = create_timestamp;
        this.update_user_id = update_user_id;
        this.update_timestamp = update_timestamp;
        this.record_status = record_status;
    }
    public Integer getRecipe_detail_id() {
        return recipe_detail_id;
    }
    public void setRecipe_detail_id(Integer recipe_detail_id) {
        this.recipe_detail_id = recipe_detail_id;
    }
    public Integer getRecipe_id() {
        return recipe_id;
    }
    public void setRecipe_id(Integer recipe_id) {
        this.recipe_id = recipe_id;
    }
    public Integer getFood_id() {
        return food_id;
    }
    public void setFood_id(Integer food_id) {
        this.food_id = food_id;
    }
    public Double getFood_quantity() {
        return food_quantity;
    }
    public void setFood_quantity(Double food_quantity) {
        this.food_quantity = food_quantity;
    }
    public Integer getFood_quantity_unit_id() {
        return food_quantity_unit_id;
    }
    public void setFood_quantity_unit_id(Integer food_quantity_unit_id) {
        this.food_quantity_unit_id = food_quantity_unit_id;
    }
    public Long getCreate_user_id() {
        return create_user_id;
    }
    public void setCreate_user_id(Long create_user_id) {
        this.create_user_id = create_user_id;
    }
    public LocalDateTime getCreate_timestamp() {
        return create_timestamp;
    }
    public void setCreate_timestamp(LocalDateTime create_timestamp) {
        this.create_timestamp = create_timestamp;
    }
    public Long getUpdate_user_id() {
        return update_user_id;
    }
    public void setUpdate_user_id(Long update_user_id) {
        this.update_user_id = update_user_id;
    }
    public LocalDateTime getUpdate_timestamp() {
        return update_timestamp;
    }
    public void setUpdate_timestamp(LocalDateTime update_timestamp) {
        this.update_timestamp = update_timestamp;
    }
    public String getRecord_status() {
        return record_status;
    }
    public void setRecord_status(String record_status) {
        this.record_status = record_status;
    }
}