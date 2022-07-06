package com.managemyfoodwaste.foodwasteproject.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@Table(name = "food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "food_id", updatable = false, nullable = false)
    private Integer food_id;
    @NotBlank
    private String food_description;
    private Integer food_type_id;
    private Integer food_shelf_life_days;
    private Integer unit_type_id;
    private Long create_user_id;
    private LocalDateTime create_timestamp;
    private Long update_user_id;
    private LocalDateTime update_timestamp;
    @NotBlank
    private String record_status;

    public Food(){
        super();
    }
    public Food(Integer food_id, String food_description, Integer food_type_id, Integer food_shelf_life_days,
                Integer unit_type_id, Long create_user_id, LocalDateTime create_timestamp, Long update_user_id,
                LocalDateTime update_timestamp, String record_status) {
        super();
        this.food_id = food_id;
        this.food_description = food_description;
        this.food_type_id = food_type_id;
        this.food_shelf_life_days = food_shelf_life_days;
        this.unit_type_id = unit_type_id;
        this.create_user_id = create_user_id;
        this.create_timestamp = create_timestamp;
        this.update_user_id = update_user_id;
        this.update_timestamp = update_timestamp;
        this.record_status = record_status;
    }
    public Integer getFood_id() {
        return food_id;
    }
    public void setFood_id(Integer food_id) {
        this.food_id = food_id;
    }
    public String getFood_description() {
        return food_description;
    }
    public void setFood_description(String food_description) {
        this.food_description = food_description;
    }
    public Integer getFood_type_id() {
        return food_type_id;
    }
    public void setFood_type_id(Integer food_type_id) {
        this.food_type_id = food_type_id;
    }
    public Integer getFood_shelf_life_days() {
        return food_shelf_life_days;
    }
    public void setFood_shelf_life_days(Integer food_shelf_life_days) {
        this.food_shelf_life_days = food_shelf_life_days;
    }
    public Integer getUnit_type_id() {
        return unit_type_id;
    }
    public void setUnit_type_id(Integer unit_type_id) {
        this.unit_type_id = unit_type_id;
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