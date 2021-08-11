package com.example.phoneshop.controller;

import java.util.List;

import com.example.phoneshop.model.Phone;
import com.example.phoneshop.service.PhoneService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PhoneController {

    @Autowired
    private PhoneService phoneService;

    @GetMapping(path = "/phone")
    public List<Phone> getPhones() {
        return phoneService.getAllPhones();
    }

    @GetMapping(path = "/phone")
    public Phone getPhone(Long id) {
        return phoneService.getPhone(id);
    }

    @PostMapping(path = "/phone")
    public void createPhone(@RequestBody Phone somePhone) {
        phoneService.createPhone(somePhone);
    }

    @PutMapping(path = "/phone")
    public void updatePhone(@RequestBody Phone somePhone) {
        phoneService.updatePhone(somePhone);
    }

    @DeleteMapping(path = "/Client")
    public void deletePhone(@RequestBody Phone somePhone ){
        phoneService.deletePhone(somePhone);
    }

}