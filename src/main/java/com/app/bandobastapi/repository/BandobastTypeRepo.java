package com.app.bandobastapi.repository;

import com.app.bandobastapi.model.BandobastType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BandobastTypeRepo extends JpaRepository<BandobastType, Integer> {
}
