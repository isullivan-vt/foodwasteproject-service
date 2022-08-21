package com.managemyfoodwaste.foodwasteproject.controller;

import com.managemyfoodwaste.foodwasteproject.model.MealTimeline;
import com.managemyfoodwaste.foodwasteproject.repository.MealTimelineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MealTimelineController {

    @Autowired
    MealTimelineRepository mealTimelineRepository;

    // Get All Shopping List Items
    @GetMapping("/api/meal-timeline/{userid}")
    public List<MealTimeline> getAllMealTimeline(@PathVariable(value = "userid") Long recordOwnerId) {
        return mealTimelineRepository.findByRecordOwnerId(recordOwnerId);
    }

}