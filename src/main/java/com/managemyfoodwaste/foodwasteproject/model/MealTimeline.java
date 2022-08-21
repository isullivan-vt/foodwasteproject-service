package com.managemyfoodwaste.foodwasteproject.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "meal_timeline_v")
public class MealTimeline {
    //Define Data Fields
    @Id
    @Column(name = "meal_date", updatable = false, nullable = false)
    private LocalDate meal_date;
    private Integer recipe_id;
    private String recipe_name;
    private String recipe_content;
    @Column(name = "record_owner_id")
    private Long recordOwnerId;

    public MealTimeline(){
        super();
    }
    // Constructor
    public MealTimeline(LocalDate meal_date, Integer recipe_id, String recipe_name,
                        String recipe_content, Long recordOwnerId) {
        super();
            this.meal_date = meal_date;
            this.recipe_id = recipe_id;
            this.recipe_name = recipe_name;
            this.recipe_content = recipe_content;
            this.recordOwnerId = recordOwnerId;
    }

    // Getter/Setter Methods
    public LocalDate getMeal_date() {
        return meal_date;
    }
    public void setMeal_date(LocalDate meal_date) {
        this.meal_date = meal_date;
    }
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
    public String getRecipe_content() {
        return recipe_content;
    }
    public void setRecipe_content(String recipe_content) {
        this.recipe_content = recipe_content;
    }
    public Long getRecordOwnerId() {
        return recordOwnerId;
    }
    public void setRecordOwnerId(Long recordOwnerId) {
        this.recordOwnerId = recordOwnerId;
    }

}