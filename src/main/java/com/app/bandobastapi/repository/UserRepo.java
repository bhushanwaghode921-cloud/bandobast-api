package com.app.bandobastapi.repository;

import com.app.bandobastapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

}
