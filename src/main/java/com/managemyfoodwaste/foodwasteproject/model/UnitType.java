package com.managemyfoodwaste.foodwasteproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@Table(name = "unit_type")
public class UnitType {
    @Id
    @GeneratedValue
    private Integer unit_type_id;
    @NotBlank
    private String unit_type_description;
    @NotBlank
    private String unit_type_abbreviation;
    private Long create_user_id;
    private LocalDateTime create_timestamp;
    private Long update_user_id;
    private LocalDateTime update_timestamp;
    @NotBlank
    private String record_status;

    public UnitType(){
        super();
    }
    public UnitType(Integer unit_type_id, String unit_type_description, String unit_type_abbreviation,
                    Long create_user_id, LocalDateTime create_timestamp, Long update_user_id,
                    LocalDateTime update_timestamp, String record_status) {
        super();
        this.unit_type_id = unit_type_id;
        this.unit_type_description = unit_type_description;
        this.unit_type_abbreviation = unit_type_abbreviation;
        this.create_user_id = create_user_id;
        this.create_timestamp = create_timestamp;
        this.update_user_id = update_user_id;
        this.update_timestamp = update_timestamp;
        this.record_status = record_status;
    }
    public Integer getUnit_type_id() {
        return unit_type_id;
    }
    public void setUnit_type_id(Integer unit_type_id) {
        this.unit_type_id = unit_type_id;
    }
    public String getUnit_type_description() {
        return unit_type_description;
    }
    public void setUnit_type_description(String unit_type_description) {
        this.unit_type_description = unit_type_description;
    }
    public String getUnit_type_abbreviation() {
        return unit_type_abbreviation;
    }
    public void setUnit_type_abbreviation(String unit_type_abbreviation) {
        this.unit_type_abbreviation = unit_type_abbreviation;
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