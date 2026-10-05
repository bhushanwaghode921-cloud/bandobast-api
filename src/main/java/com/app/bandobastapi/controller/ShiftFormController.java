package com.app.bandobastapi.controller;


import com.app.bandobastapi.model.RejectionTemplate;
import com.app.bandobastapi.model.ShiftFormModel;
import com.app.bandobastapi.repository.ShiftFormRepo;
import com.app.bandobastapi.service.ShiftFormService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/form")
public class ShiftFormController {
    @Autowired
    ShiftFormService service;


    @GetMapping("/shift-form")
    public ResponseEntity<List<ShiftFormModel>> getShiftForm() {

        try {
            if (service.allShiftForms() == null) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            return new ResponseEntity<>(service.allShiftForms(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/shift-form/{id}")
    public ResponseEntity<ShiftFormModel> getShiftForm(@PathVariable Integer id) {
        ShiftFormModel shift = service.getShiftFormById(id);

        if(shift == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(shift, HttpStatus.OK);
    }

    @PostMapping("/shift-form")
    public ResponseEntity<ShiftFormModel> createShiftForm(@RequestBody ShiftFormModel form) {
        try {
            if (form == null) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            service.addShiftForm(form);
            return new ResponseEntity<>(form, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }
}
