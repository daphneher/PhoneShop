package com.example.phoneshop.repository;

import com.example.phoneshop.model.Client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>  {
    
}
