package com.app.bandobastapi.service;

import com.app.bandobastapi.model.SpecialInstructionForm;
import com.app.bandobastapi.repository.SpecialInstructionFormRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialInstructionService {


    @Autowired
    SpecialInstructionFormRepo repo;

    public SpecialInstructionForm getSpecialInstructionForm(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public void addSpecialInstructionForm(SpecialInstructionForm specialInstructionForm) {
        repo.save(specialInstructionForm);
    }
    public List<SpecialInstructionForm> AllSpecialInstructionFormData(){
       return repo.findAll();
    }

}
