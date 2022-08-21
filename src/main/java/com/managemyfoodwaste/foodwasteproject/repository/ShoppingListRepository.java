package com.managemyfoodwaste.foodwasteproject.repository;

import com.managemyfoodwaste.foodwasteproject.model.ShoppingList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoppingListRepository extends JpaRepository<ShoppingList, Integer> {
    // Lists all shopping list records where record status and record owner id match parameters
    List<ShoppingList> findByStatusAndRecordOwnerId(String record_status, Integer recordOwnerId);
}
