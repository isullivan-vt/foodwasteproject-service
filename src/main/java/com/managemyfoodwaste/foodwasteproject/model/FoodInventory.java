package com.managemyfoodwaste.foodwasteproject.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "food_inventory")
public class FoodInventory {
    // Define data fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "food_inventory_id", updatable = false, nullable = false)
    private Integer food_inventory_id;
    private Integer food_id;
    private Double food_quantity;
    private Integer food_unit_id;
    private LocalDate food_acquisition_date;
    private Double food_cost_usd;
    private String notes;
    private Long create_user_id;
    private LocalDateTime create_timestamp;
    private Long update_user_id;
    private LocalDateTime update_timestamp;
    @NotBlank
    private String record_status;

    public FoodInventory(){
        super();
    }
    // Constructor
    public FoodInventory(Integer food_inventory_id, Integer food_id, Double food_quantity, Integer food_unit_id, LocalDate food_acquisition_date,
                         Double food_cost_usd, String notes, Long create_user_id, LocalDateTime create_timestamp, Long update_user_id,
                         LocalDateTime update_timestamp, String record_status) {
        super();
        this.food_inventory_id = food_inventory_id;
        this.food_id = food_id;
        this.food_quantity = food_quantity;
        this.food_unit_id = food_unit_id;
        this.food_acquisition_date = food_acquisition_date;
        this.food_cost_usd = food_cost_usd;
        this.notes = notes;
        this.create_user_id = create_user_id;
        this.create_timestamp = create_timestamp;
        this.update_user_id = update_user_id;
        this.update_timestamp = update_timestamp;
        this.record_status = record_status;
    }

    // Getter/Setter Methods
    public Integer getFood_inventory_id() {
        return food_inventory_id;
    }
    public void setFood_inventory_id(Integer food_inventory_id) {
        this.food_inventory_id = food_inventory_id;
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
    public Integer getFood_unit_id() {
        return food_unit_id;
    }
    public void setFood_unit_id(Integer food_unit_id) {
        this.food_unit_id = food_unit_id;
    }
    public LocalDate getFood_acquisition_date() {
        return food_acquisition_date;
    }
    public void setFood_acquisition_date(LocalDate food_acquisition_date) {
        this.food_acquisition_date = food_acquisition_date;
    }
    public Double getFood_cost_usd() {
        return food_cost_usd;
    }
    public void setFood_cost_usd(Double food_cost_usd) {
        this.food_cost_usd = food_cost_usd;
    }
    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }
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