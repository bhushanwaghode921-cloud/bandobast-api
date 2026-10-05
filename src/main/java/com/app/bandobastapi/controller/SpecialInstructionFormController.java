package com.app.bandobastapi.controller;


import com.app.bandobastapi.model.SpecialInstructionForm;
import com.app.bandobastapi.service.SpecialInstructionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/form")
@CrossOrigin
public class SpecialInstructionFormController {


    @Autowired
    SpecialInstructionService service;

    @PostMapping("/special-instruction-form")
    public ResponseEntity<SpecialInstructionForm> addSpecialInstruction(@RequestBody SpecialInstructionForm form) {

        try {
            if (form == null) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            service.addSpecialInstructionForm(form);
            return new ResponseEntity<>(form, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/special-instruction-form/{id}")
    public ResponseEntity<SpecialInstructionForm> getSpecialInstructionForm(@PathVariable Integer id) {
        try {
            if (id == null) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            SpecialInstructionForm form = service.getSpecialInstructionForm(id);
            return new ResponseEntity<>(form, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/special-instruction-form")
    public ResponseEntity<List<SpecialInstructionForm>> getSpecialInstructionForm() {
        try {
            if (service.AllSpecialInstructionFormData() == null) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            return new ResponseEntity<>(service.AllSpecialInstructionFormData(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
