package com.managemyfoodwaste.foodwasteproject.repository;

import com.managemyfoodwaste.foodwasteproject.model.MealTimeline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MealTimelineRepository extends JpaRepository<MealTimeline, Integer> {
    // Lists all Meal Timeline records where the record owner id matches the parameter
    List<MealTimeline> findByRecordOwnerId(Long recordOwnerId);
}
