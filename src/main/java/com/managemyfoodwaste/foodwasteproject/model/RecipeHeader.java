package com.managemyfoodwaste.foodwasteproject.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@Table(name = "recipe_header")
public class RecipeHeader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_id", updatable = false, nullable = false)
    private Integer recipe_id;
    @NotBlank
    private String recipe_name;
    @NotBlank
    private String recipe_content;
    @NotBlank
    private String recipe_user_notes;
    private Long create_user_id;
    private LocalDateTime create_timestamp;
    private Long update_user_id;
    private LocalDateTime update_timestamp;
    @NotBlank
    private String record_status;

    public RecipeHeader(){
        super();
    }
    public RecipeHeader(Integer recipe_id, String recipe_name, String recipe_content, String recipe_user_notes,
                        Long create_user_id, LocalDateTime create_timestamp, Long update_user_id,
                        LocalDateTime update_timestamp, String record_status) {
        super();
        this.recipe_id = recipe_id;
        this.recipe_name = recipe_name;
        this.recipe_content = recipe_content;
        this.recipe_user_notes = recipe_user_notes;
        this.create_user_id = create_user_id;
        this.create_timestamp = create_timestamp;
        this.update_user_id = update_user_id;
        this.update_timestamp = update_timestamp;
        this.record_status = record_status;
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
    public String getRecipe_user_notes() {
        return recipe_user_notes;
    }
    public void setRecipe_user_notes(String recipe_user_notes) {
        this.recipe_user_notes = recipe_user_notes;
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