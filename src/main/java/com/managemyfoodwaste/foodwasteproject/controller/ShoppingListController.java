package com.managemyfoodwaste.foodwasteproject.controller;

import com.managemyfoodwaste.foodwasteproject.model.ShoppingList;
import com.managemyfoodwaste.foodwasteproject.repository.ShoppingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShoppingListController {

    @Autowired
    ShoppingListRepository shoppingListRepository;

    // Get All Shopping List Items
    @GetMapping("/api/shopping-list/{id}")
    public List<ShoppingList> getAllShoppingList(@PathVariable(value = "id") Integer recordOwnerId) {
        return shoppingListRepository.findByStatusAndRecordOwnerId("L", recordOwnerId);
    }

    // Get All Shopping List Items
    @GetMapping("/api/pantry/{id}")
    public List<ShoppingList> getAllPantry(@PathVariable(value = "id") Integer recordOwnerId) {
        return shoppingListRepository.findByStatusAndRecordOwnerId("A", recordOwnerId);
    }

}