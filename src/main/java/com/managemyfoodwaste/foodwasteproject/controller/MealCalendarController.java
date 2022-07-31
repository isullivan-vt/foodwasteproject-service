package com.managemyfoodwaste.foodwasteproject.controller;

import com.managemyfoodwaste.foodwasteproject.exception.MealCalendarNotFoundException;
import com.managemyfoodwaste.foodwasteproject.model.MealCalendar;
import com.managemyfoodwaste.foodwasteproject.repository.MealCalendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class MealCalendarController {

    @Autowired
    MealCalendarRepository mealCalendarRepository;

    // Get All Meal Calendar Records
    @GetMapping("/api/meal-calendar")
    public List<MealCalendar> getAllMealCalendars() {
        return mealCalendarRepository.findAll();
    }

    // Create a new Meal Calendar Record
    @PostMapping("/api/meal-calendar")
    public MealCalendar createMealCalendar(@Valid @RequestBody MealCalendar mealCalendar) {
        return mealCalendarRepository.save(mealCalendar);
    }

    // Get a Single Meal Calendar Record
    @GetMapping("/api/meal-calendar/{id}")
    public MealCalendar getMealCalendarById(@PathVariable(value = "id") Integer meal_calendar_id) throws MealCalendarNotFoundException {
        return mealCalendarRepository.findById(meal_calendar_id)
                .orElseThrow(() -> new MealCalendarNotFoundException(meal_calendar_id));
    }

    // Update a Meal Calendar Record
    @PutMapping("/api/meal-calendar/{id}")
    public MealCalendar updateMealCalendar(@PathVariable(value = "id") Integer meal_calendar_id,
                           @Valid @RequestBody MealCalendar mealCalendarDetails) throws MealCalendarNotFoundException {

        MealCalendar mealCalendar = mealCalendarRepository.findById(meal_calendar_id)
                .orElseThrow(() -> new MealCalendarNotFoundException(meal_calendar_id));

        mealCalendar.setRecipe_id(mealCalendarDetails.getRecipe_id());
        mealCalendar.setMeal_date(mealCalendarDetails.getMeal_date());
        mealCalendar.setCreate_user_id(mealCalendarDetails.getCreate_user_id());
        mealCalendar.setCreate_timestamp(mealCalendarDetails.getCreate_timestamp());
        mealCalendar.setUpdate_user_id(mealCalendarDetails.getUpdate_user_id());
        mealCalendar.setUpdate_timestamp(mealCalendarDetails.getUpdate_timestamp());
        mealCalendar.setRecord_status(mealCalendarDetails.getRecord_status());

        MealCalendar updatedMealCalendar = mealCalendarRepository.save(mealCalendar);

        return updatedMealCalendar;
    }

    // Delete a Meal Calendar Record
    @DeleteMapping("/meal-calendar/{id}")
    public ResponseEntity<?> deleteMealCalendar(@PathVariable(value = "id") Integer meal_calendar_id) throws MealCalendarNotFoundException {
        MealCalendar mealCalendar = mealCalendarRepository.findById(meal_calendar_id)
                .orElseThrow(() -> new MealCalendarNotFoundException(meal_calendar_id));

        mealCalendarRepository.delete(mealCalendar);

        return ResponseEntity.ok().build();
    }
}