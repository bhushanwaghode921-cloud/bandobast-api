package com.app.bandobastapi.repository;

import com.app.bandobastapi.model.ShiftFormModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShiftFormRepo extends JpaRepository<ShiftFormModel, Integer> {
}
