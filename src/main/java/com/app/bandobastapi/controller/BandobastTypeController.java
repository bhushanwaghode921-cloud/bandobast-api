package com.app.bandobastapi.controller;

import com.app.bandobastapi.model.BandobastType;
import com.app.bandobastapi.service.BandobastTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/form")
@CrossOrigin
public class BandobastTypeController {

    @Autowired
    BandobastTypeService service;

    @GetMapping("/bandobast-type")
    public ResponseEntity<List<BandobastType>> getBandobastTypes() {
        try {
            return new ResponseEntity<>(service.allBandobastTypes(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/bandobast-type/{id}")
    public ResponseEntity<BandobastType> getBandobastType(@PathVariable Integer id) {
        BandobastType type = service.getBandobastTypeById(id);

        if (type == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(type, HttpStatus.OK);
    }

    @PostMapping("/bandobast-type")
    public ResponseEntity<BandobastType> createBandobastType(@RequestBody BandobastType bandobastType) {
        try {
            if (bandobastType == null) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            service.addBandobastType(bandobastType);
            return new ResponseEntity<>(bandobastType, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
