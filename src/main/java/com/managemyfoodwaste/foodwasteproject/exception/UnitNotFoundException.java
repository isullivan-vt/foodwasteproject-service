package com.managemyfoodwaste.foodwasteproject.exception;

public class UnitNotFoundException extends Exception {
    private Integer unit_id;
    public UnitNotFoundException(Integer unit_id) {
        super(String.format("Unit is not found with id : '%s'", unit_id));
    }
}
