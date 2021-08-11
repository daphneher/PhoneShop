package com.example.phoneshop.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String brand;

    private String model;

    private Float price;

    private String code;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "buyOrder_id")
    private BuyOrder buyOrder;

    public String getBrand(){
        return this.brand;
    }
    public void setBrand(String someBrand){
        this.brand = someBrand;
    }
    public Long getId(){
        return this.id;
    }
    public String getModel(){
        return this.model;
    }
    public void setModel(String someModel){
        this.model = someModel;
    }
    public Float getPrice(){
        return this.price;
    }
    public void setPrice(Float somePrice){
        this.price =  somePrice;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String someCode){
        this.code = someCode;
    }

}