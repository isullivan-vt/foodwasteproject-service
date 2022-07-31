package com.managemyfoodwaste.foodwasteproject.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "meal_calendar")
public class MealCalendar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "meal_calendar_id", updatable = false, nullable = false)
    private Integer meal_calendar_id;
    private Integer recipe_id;
    private LocalDate meal_date;
    private Long create_user_id;
    private LocalDateTime create_timestamp;
    private Long update_user_id;
    private LocalDateTime update_timestamp;
    @NotBlank
    private String record_status;

    public MealCalendar(){
        super();
    }
    public MealCalendar(Integer meal_calendar_id, Integer recipe_id, LocalDate meal_date, Long create_user_id, LocalDateTime create_timestamp, Long update_user_id,
                        LocalDateTime update_timestamp, String record_status) {
        super();
        this.meal_calendar_id = meal_calendar_id;
        this.recipe_id = recipe_id;
        this.meal_date = meal_date;
        this.create_user_id = create_user_id;
        this.create_timestamp = create_timestamp;
        this.update_user_id = update_user_id;
        this.update_timestamp = update_timestamp;
        this.record_status = record_status;
    }
    public Integer getMeal_calendar_id() {
        return meal_calendar_id;
    }
    public void setMeal_calendar_id(Integer meal_calendar_id) {
        this.meal_calendar_id = meal_calendar_id;
    }
    public Integer getRecipe_id() {
        return recipe_id;
    }
    public void setRecipe_id(Integer recipe_id) {
        this.recipe_id = recipe_id;
    }
    public LocalDate getMeal_date() {
        return meal_date;
    }
    public void setMeal_date(LocalDate meal_date) {
        this.meal_date = meal_date;
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