package com.managemyfoodwaste.foodwasteproject.controller;

import com.managemyfoodwaste.foodwasteproject.exception.UnitNotFoundException;
import com.managemyfoodwaste.foodwasteproject.model.Unit;
import com.managemyfoodwaste.foodwasteproject.repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UnitController {

    @Autowired
    UnitRepository unitRepository;

    // Get All Unit
    @GetMapping("/unit")
    public List<Unit> getAllUnits() {
        return unitRepository.findAll();
    }

    // Create a new Unit
    @PostMapping("/unit")
    public Unit createUnit(@Valid @RequestBody Unit unit) {
        return unitRepository.save(unit);
    }

    // Get a Single Unit
    @GetMapping("/unit/{id}")
    public Unit getUnitById(@PathVariable(value = "id") Integer unit_id) throws UnitNotFoundException {
        return unitRepository.findById(unit_id)
                .orElseThrow(() -> new UnitNotFoundException(unit_id));
    }

    // Update a Unit
    @PutMapping("/unit/{id}")
    public Unit updateUnit(@PathVariable(value = "id") Integer unit_id,
                           @Valid @RequestBody Unit unitDetails) throws UnitNotFoundException {

        Unit unit = unitRepository.findById(unit_id)
                .orElseThrow(() -> new UnitNotFoundException(unit_id));

        unit.setUnit_description(unitDetails.getUnit_description());
        unit.setUnit_abbreviation(unitDetails.getUnit_abbreviation());
        unit.setUnit_type_id(unitDetails.getUnit_type_id());
        unit.setCreate_user_id(unitDetails.getCreate_user_id());
        unit.setCreate_timestamp(unitDetails.getCreate_timestamp());
        unit.setUpdate_user_id(unitDetails.getUpdate_user_id());
        unit.setUpdate_timestamp(unitDetails.getUpdate_timestamp());
        unit.setRecord_status(unitDetails.getRecord_status());

        Unit updatedUnit = unitRepository.save(unit);

        return updatedUnit;
    }

    // Delete a Unit
    @DeleteMapping("/unit/{id}")
    public ResponseEntity<?> deleteUnit(@PathVariable(value = "id") Integer unit_id) throws UnitNotFoundException {
        Unit unit = unitRepository.findById(unit_id)
                .orElseThrow(() -> new UnitNotFoundException(unit_id));

        unitRepository.delete(unit);

        return ResponseEntity.ok().build();
    }
}