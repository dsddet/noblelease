package com.lordworth.noblelease.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Address implements Serializable,Comparable<Address> {
    @Id
    @GeneratedValue
    private Integer id;
    private String streetName;
    private String village;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    @Override
    public int compareTo(Address address) {
        return (id+village.length()+streetName.length())-(address.getId()+address.getStreetName().length()+address.getVillage().length());
    }

    @Override
    public String toString(){
        return id+", "+streetName+", "+village;
    }

    @Override
    public boolean equals(Object object){
        Address address=(Address) object;
        return id.equals(address.getId())&&village.equals(address.getVillage())&&streetName.equals(address.getStreetName());
    }

    @Override
    public int hashCode(){
        return id*village.length()*streetName.length()*11;
    }

}
