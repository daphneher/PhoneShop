package com.example.phoneshop.repository;

import com.example.phoneshop.model.Phone;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Long>{
    
}
