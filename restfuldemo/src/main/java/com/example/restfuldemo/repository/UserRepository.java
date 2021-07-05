package com.example.restfuldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.restfuldemo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	
}