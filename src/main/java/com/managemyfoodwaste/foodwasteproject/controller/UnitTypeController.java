package com.managemyfoodwaste.foodwasteproject.controller;

import com.managemyfoodwaste.foodwasteproject.exception.UnitTypeNotFoundException;
import com.managemyfoodwaste.foodwasteproject.model.UnitType;
import com.managemyfoodwaste.foodwasteproject.repository.UnitTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import javax.validation.Valid;
import java.util.List;

@RestController
public class UnitTypeController {

    @Autowired
    UnitTypeRepository unitTypeRepository;

    // Get All Unit Types
    @GetMapping("/api/unit_type")
    public List<UnitType> getAllUnitTypes() {
        return unitTypeRepository.findAll();
    }

    // Create a new Unit Type
    @PostMapping("/api/unit_type")
    public UnitType createUnitType(@Valid @RequestBody UnitType unitType) {
        return unitTypeRepository.save(unitType);
    }

    // Get a Single Unit Type
    @GetMapping("/api/unit_type/{id}")
    public UnitType getUnitTypeById(@PathVariable(value = "id") Integer unit_type_id) throws UnitTypeNotFoundException {
        return unitTypeRepository.findById(unit_type_id)
                .orElseThrow(() -> new UnitTypeNotFoundException(unit_type_id));
    }

    // Update a Unit Type
    @PutMapping("/api/unit_type/{id}")
    public UnitType updateUnitType(@PathVariable(value = "id") Integer unit_type_id,
                           @Valid @RequestBody UnitType unitTypeDetails) throws UnitTypeNotFoundException {

        UnitType unitType = unitTypeRepository.findById(unit_type_id)
                .orElseThrow(() -> new UnitTypeNotFoundException(unit_type_id));

        unitType.setUnit_type_description(unitTypeDetails.getUnit_type_description());
        unitType.setUnit_type_abbreviation(unitTypeDetails.getUnit_type_abbreviation());
        unitType.setCreate_user_id(unitTypeDetails.getCreate_user_id());
        unitType.setCreate_timestamp(unitTypeDetails.getCreate_timestamp());
        unitType.setUpdate_user_id(unitTypeDetails.getUpdate_user_id());
        unitType.setUpdate_timestamp(unitTypeDetails.getUpdate_timestamp());
        unitType.setRecord_status(unitTypeDetails.getRecord_status());

        UnitType updatedUnitType = unitTypeRepository.save(unitType);

        return updatedUnitType;
    }

    // Delete a Unit Type
    @DeleteMapping("/api/unit_type/{id}")
    public ResponseEntity<?> deleteUnitType(@PathVariable(value = "id") Integer unit_type_id) throws UnitTypeNotFoundException {
        UnitType unitType = unitTypeRepository.findById(unit_type_id)
                .orElseThrow(() -> new UnitTypeNotFoundException(unit_type_id));

        unitTypeRepository.delete(unitType);

        return ResponseEntity.ok().build();
    }
}