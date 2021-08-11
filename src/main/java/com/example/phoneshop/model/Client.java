package com.example.phoneshop.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String surname;

    private String dni;

    private String address;

    private String phoneNumber;

    @JsonIgnore
    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<BuyOrder> buyOrder;

    public Long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String someName){
        this.name = someName;
    }
    public void setSurname(String someSurName){
        this.surname = someSurName;
    }
    public String getSurname(){
        return this.surname;
    }
    public void setDni(String someDni){
        this.dni = someDni;
    }
    public String getDni(){
        return this.dni;
    }
    public void setAddress(String someAddress){
        this.address = someAddress;
    }
    public String getAddress(){
        return this.address;
    }
    public void setPhoneNumber(String somePhoneNumber){
        this.phoneNumber = somePhoneNumber;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

}
