package com.managemyfoodwaste.foodwasteproject.controller;

import com.managemyfoodwaste.foodwasteproject.exception.UserNotFoundException;
import com.managemyfoodwaste.foodwasteproject.model.User;
import com.managemyfoodwaste.foodwasteproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    // Get All User
    @GetMapping("/user")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Create a new User
    @PostMapping("/user")
    public User createUser(@Valid @RequestBody User user) {
        return userRepository.save(user);
    }

    // Get a Single User
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable(value = "id") Integer user_id) throws UserNotFoundException {
        return userRepository.findById(user_id)
                .orElseThrow(() -> new UserNotFoundException(user_id));
    }

    // Update a User
    @PutMapping("/user/{id}")
    public User updateUser(@PathVariable(value = "id") Integer user_id,
                           @Valid @RequestBody User userDetails) throws UserNotFoundException {

        User user = userRepository.findById(user_id)
                .orElseThrow(() -> new UserNotFoundException(user_id));

        user.setUser_name(userDetails.getUser_name());
        user.setUser_email(userDetails.getUser_email());
        user.setCreate_user_id(userDetails.getCreate_user_id());
        user.setCreate_timestamp(userDetails.getCreate_timestamp());
        user.setUpdate_user_id(userDetails.getUpdate_user_id());
        user.setUpdate_timestamp(userDetails.getUpdate_timestamp());
        user.setRecord_status(userDetails.getRecord_status());

        User updatedUser = userRepository.save(user);

        return updatedUser;
    }

    // Delete a User
    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable(value = "id") Integer user_id) throws UserNotFoundException {
        User user = userRepository.findById(user_id)
                .orElseThrow(() -> new UserNotFoundException(user_id));

        userRepository.delete(user);

        return ResponseEntity.ok().build();
    }
}