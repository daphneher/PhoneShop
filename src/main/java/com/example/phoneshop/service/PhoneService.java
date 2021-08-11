package com.example.phoneshop.service;

import java.util.List;

import com.example.phoneshop.model.Phone;
import com.example.phoneshop.repository.PhoneRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneService {

    @Autowired
    private PhoneRepository phoneRepository;

    public List<Phone> getAllPhones() {
        return phoneRepository.findAll();
    }

    public Phone getPhone(Long id) {
        return phoneRepository.getById(id);
    }

    public void createPhone(Phone somePhone) {
        phoneRepository.save(somePhone);
    }

    public void updatePhone(Phone somePhone) {
        Phone phone = this.getPhone(somePhone.getId());
        
        phone.setBrand(somePhone.getBrand());
        phone.setModel(somePhone.getModel());
        phone.setPrice(somePhone.getPrice());
        phone.setCode(somePhone.getCode());
        phoneRepository.save(somePhone);
    }

    public void deletePhone(Phone somePhone){
        phoneRepository.delete(somePhone);
    }
    
}
