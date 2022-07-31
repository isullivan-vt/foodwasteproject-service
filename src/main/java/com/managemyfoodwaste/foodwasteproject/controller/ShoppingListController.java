package com.managemyfoodwaste.foodwasteproject.controller;

import com.managemyfoodwaste.foodwasteproject.model.ShoppingList;
import com.managemyfoodwaste.foodwasteproject.repository.ShoppingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ShoppingListController {

    @Autowired
    ShoppingListRepository shoppingListRepository;

    // Get All Shopping List Items
    @GetMapping("/api/shopping-list")
    public List<ShoppingList> getAllShoppingList() {
        return shoppingListRepository.findByStatusIs("L");
    }

    // Get All Shopping List Items
    @GetMapping("/api/pantry")
    public List<ShoppingList> getAllPantry() {
        return shoppingListRepository.findByStatusIs("A");
    }

}