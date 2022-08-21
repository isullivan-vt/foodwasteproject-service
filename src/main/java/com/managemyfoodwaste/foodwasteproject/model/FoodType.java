package com.managemyfoodwaste.foodwasteproject.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@Table(name = "food_type")
public class FoodType {

    // Define Data Fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer food_type_id;
    @NotBlank
    private String food_type_description;
    private Long create_user_id;
    private LocalDateTime create_timestamp;
    private Long update_user_id;
    private LocalDateTime update_timestamp;
    @NotBlank
    private String record_status;

    public FoodType(){
        super();
    }
    //Constructor
    public FoodType(Integer food_type_id, String food_type_description,
                    Long create_user_id, LocalDateTime create_timestamp, Long update_user_id,
                    LocalDateTime update_timestamp, String record_status) {
        super();
        this.food_type_id = food_type_id;
        this.food_type_description = food_type_description;
        this.create_user_id = create_user_id;
        this.create_timestamp = create_timestamp;
        this.update_user_id = update_user_id;
        this.update_timestamp = update_timestamp;
        this.record_status = record_status;
    }

    // Getter/Setter Methods
    public Integer getFood_type_id() {
        return food_type_id;
    }
    public void setFood_type_id(Integer food_type_id) {
        this.food_type_id = food_type_id;
    }
    public String getFood_type_description() {
        return food_type_description;
    }
    public void setFood_type_description(String Food_type_description) {
        this.food_type_description = food_type_description;
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