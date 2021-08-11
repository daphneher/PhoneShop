package com.example.phoneshop.model;


import java.util.List;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class BuyOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private Client client;

    private LocalDateTime creationDate;

    @OneToMany(mappedBy = "buyOrder", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Phone> phones;

    private Float payAmount;

    public void setClient(Client someClient){
        this.client = someClient;
    }
    public Client getClient(){
        return this.client;
    }
    public LocalDateTime getCreationDate(){
        return this.creationDate;
    }
    public void setPhones(List<Phone> somePhones){
        this.phones = somePhones;
    }
    public List<Phone> getPhones(){
        return this.phones;
    }
    public void setPayAmount(){
        
        this.phones.stream().forEach(a -> this.payAmount = this.payAmount + a.getPrice());
    }
    public void buyOrder(Client client,List<Phone> phones ){
        this.setClient(client);
        this.setPhones(phones);
        this.creationDate = LocalDateTime.now();
        this.setPayAmount();

    }
}