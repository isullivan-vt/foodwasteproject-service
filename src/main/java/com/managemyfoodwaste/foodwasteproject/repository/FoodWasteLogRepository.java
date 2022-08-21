package com.managemyfoodwaste.foodwasteproject.repository;

import com.managemyfoodwaste.foodwasteproject.model.FoodWasteLog;
import com.managemyfoodwaste.foodwasteproject.model.ShoppingList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodWasteLogRepository extends JpaRepository<FoodWasteLog, Integer> {
    List<FoodWasteLog> findByRecordOwnerId(Long recordOwnerId);
}
