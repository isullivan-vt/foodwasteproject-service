package com.managemyfoodwaste.foodwasteproject.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Table(name = "shopping_list_v")
public class ShoppingList {
    // Define Data Fields
    @Id
    private Integer food_inventory_id;
    private Integer food_id;
    @NotBlank
    private String food_description;
    private Integer food_type_id;
    @NotBlank
    private String food_type_description;
    private Double food_quantity;
    private Integer unit_id;
    private String unit_abbreviation;
    private Double food_cost;
    private LocalDate expiration_date;
    private LocalDate food_acquisition_date;
    @NotBlank
    private String status;
    @Column(name = "record_owner_id")
    private Integer recordOwnerId;

    public ShoppingList(){
        super();
    }
    // Constructor
    public ShoppingList(Integer food_inventory_id, Integer food_id, String food_description, Integer food_type_id,
                        String food_type_description, Double food_quantity, Integer unit_id, String unit_abbreviation
                        , Double food_cost, LocalDate expiration_date, LocalDate food_acquisition_date, String status,
                        Integer recordOwnerId) {
        super();
        this.food_inventory_id = food_inventory_id;
        this.food_id = food_id;
        this.food_description = food_description;
        this.food_type_id = food_type_id;
        this.food_type_description = food_type_description;
        this.food_quantity = food_quantity;
        this.unit_id = unit_id;
        this.unit_abbreviation = unit_abbreviation;
        this.food_cost = food_cost;
        this.expiration_date = expiration_date;
        this.food_acquisition_date = food_acquisition_date;
        this.status = status;
        this.recordOwnerId = recordOwnerId;
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
    public String getFood_type_description() {
        return food_type_description;
    }
    public void setFood_type_description(String food_type_description) {
        this.food_type_description = food_type_description;
    }
    public Double getFood_quantity() {
        return food_quantity;
    }
    public void setFood_quantity(Double food_quantity) {
        this.food_quantity = food_quantity;
    }
    public Integer getUnit_id() {
        return unit_id;
    }
    public void setUnit_id(Integer unit_id) {
        this.unit_id = unit_id;
    }
    public String getUnit_abbreviation() {
        return unit_abbreviation;
    }
    public void setUnit_abbreviation(String unit_abbreviation) {
        this.unit_abbreviation = unit_abbreviation;
    }
    public Double getFood_cost() {
        return food_cost;
    }
    public void setFood_cost(Double food_cost) {
        this.food_cost = food_cost;
    }
    public LocalDate getExpiration_date() {
        return expiration_date;
    }
    public void setExpiration_date(LocalDate expiration_date) {
        this.expiration_date = expiration_date;
    }
    public LocalDate getFood_acquisition_date() {
        return food_acquisition_date;
    }
    public void setFood_acquisition_date(LocalDate food_acquisition_date) {
        this.food_acquisition_date = food_acquisition_date;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Integer getRecordOwnerId() {
        return recordOwnerId;
    }
    public void setRecordOwnerId(Integer recordOwnerId) {
        this.recordOwnerId = recordOwnerId;
    }
}