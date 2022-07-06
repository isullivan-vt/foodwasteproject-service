package com.managemyfoodwaste.foodwasteproject.exception;

public class UnitTypeNotFoundException extends Exception {
    private Integer unit_type_id;
    public UnitTypeNotFoundException(Integer unit_type_id) {
        super(String.format("Unit Type is not found with id : '%s'", unit_type_id));
    }
}
