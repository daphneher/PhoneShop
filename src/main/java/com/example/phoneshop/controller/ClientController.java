package com.example.phoneshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.example.phoneshop.model.Client;
import com.example.phoneshop.service.ClientService;

@RestController
@RequestMapping("/api")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping(path = "/client")
    public List<Client> getClients() {
        return clientService.getAllClients();
    }

    @GetMapping(path = "/client")
    public Client getClient(Long id) {
        return clientService.getClient(id);
    }

    @PostMapping(path = "/client")
    public void createClient(@RequestBody Client someClient) {
        clientService.createClient(someClient);
    }

    @PutMapping(path = "/client")
    public void updateClient(@RequestBody Client someClient) {
        clientService.updateClient(someClient);
    }

    @DeleteMapping(path = "/Client")
    public void deleteClient(@RequestBody Client someClient ){
        clientService.deleteClient(someClient);
    }
}