package com.app.bandobastapi.service;


import com.app.bandobastapi.model.ShiftFormModel;
import com.app.bandobastapi.repository.ShiftFormRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShiftFormService {

    @Autowired
    ShiftFormRepo repo;

    public ShiftFormModel getShiftFormById(Integer id) {
        return repo.findById(id).orElse(null);
    }
    public void addShiftForm(ShiftFormModel shiftFormModel) {
        repo.save(shiftFormModel);
    }
    public List<ShiftFormModel> allShiftForms(){
        return repo.findAll();
    }
}
