package com.managemyfoodwaste.foodwasteproject.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@Table(name = "unit")
public class Unit {
    // Define Data Fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer unit_id;
    @NotBlank
    private String unit_description;
    @NotBlank
    private String unit_abbreviation;
    private Integer unit_type_id;
    private Long create_user_id;
    private LocalDateTime create_timestamp;
    private Long update_user_id;
    private LocalDateTime update_timestamp;
    @NotBlank
    private String record_status;

    public Unit(){
        super();
    }
    // Constructor
    public Unit(Integer unit_id, String unit_description, String unit_abbreviation, Integer unit_type_id,
                Long create_user_id, LocalDateTime create_timestamp, Long update_user_id,
                LocalDateTime update_timestamp, String record_status) {
        super();
        this.unit_id = unit_id;
        this.unit_description = unit_description;
        this.unit_abbreviation = unit_abbreviation;
        this.unit_type_id = unit_type_id;
        this.create_user_id = create_user_id;
        this.create_timestamp = create_timestamp;
        this.update_user_id = update_user_id;
        this.update_timestamp = update_timestamp;
        this.record_status = record_status;
    }

    // Getter/Setter Methods
    public Integer getUnit_id() {
        return unit_id;
    }
    public void setUnit_id(Integer unit_id) {
        this.unit_id = unit_id;
    }
    public String getUnit_description() {
        return unit_description;
    }
    public void setUnit_description(String unit_description) {
        this.unit_description = unit_description;
    }
    public String getUnit_abbreviation() {
        return unit_abbreviation;
    }
    public void setUnit_abbreviation(String unit_abbreviation) {
        this.unit_abbreviation = unit_abbreviation;
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