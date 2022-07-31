package com.managemyfoodwaste.foodwasteproject.exception;

public class MealCalendarNotFoundException extends Exception {
    private Integer meal_calendar_id;
    public MealCalendarNotFoundException(Integer meal_calendar_id) {
        super(String.format("Meal Calendar Entry is not found with id : '%s'", meal_calendar_id));
    }
}
