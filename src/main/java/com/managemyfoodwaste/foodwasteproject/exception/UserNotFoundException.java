package com.managemyfoodwaste.foodwasteproject.exception;

public class UserNotFoundException extends Exception {
    private Integer userid;
    public UserNotFoundException(Integer userid) {
        super(String.format("User is not found with id : '%s'", userid));
    }
}
