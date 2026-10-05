package com.app.bandobastapi.service;

import com.app.bandobastapi.model.BandobastType;
import com.app.bandobastapi.repository.BandobastTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BandobastTypeService {

    @Autowired
    BandobastTypeRepo repo;

    public BandobastType getBandobastTypeById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public void addBandobastType(BandobastType bandobastType) {
        repo.save(bandobastType);
    }

    public List<BandobastType> allBandobastTypes() {
        return repo.findAll();
    }
}
