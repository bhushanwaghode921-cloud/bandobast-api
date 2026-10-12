package com.app.bandobastapi.controller;

import com.app.bandobastapi.model.RejectionTemplate;
import com.app.bandobastapi.service.RejectionTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/form")
@CrossOrigin
public class RejectionTemplateController {

    @Autowired
    RejectionTemplateService service;


    @GetMapping("/rejection-template/{id}")
    public ResponseEntity<RejectionTemplate> getRejectionTemplateForm(@PathVariable Integer id){
        RejectionTemplate rt = service.getRejectionTemplate(id);

        if(rt == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(rt, HttpStatus.OK);
    }


    @PostMapping(value = "/rejection-template")
    public ResponseEntity<RejectionTemplate> createRejectionTemplate(@RequestBody RejectionTemplate rejectionTemplate){
        try{
            if (rejectionTemplate == null){
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            service.addRejectionTemplate(rejectionTemplate);
            return new ResponseEntity<>(rejectionTemplate, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
