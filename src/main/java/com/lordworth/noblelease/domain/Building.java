package com.lordworth.noblelease.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Building implements Serializable,Comparable<Building> {
    @Id
    private Integer id;
    private String name;
    @ManyToOne
    private Land land;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "building_id")
    private Set<Apartment> apartmentSet;
    @OneToOne
    private Type typeOfBulding;

    public Set<Apartment> getApartmentSet() {
        return apartmentSet;
    }

    public void setApartmentSet(Set<Apartment> apartmentSet) {
        this.apartmentSet = apartmentSet;
    }

    public void addApartmentToSet(Apartment apartment) {
        this.apartmentSet.add(apartment);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Land getLand() {
        return land;
    }

    public void setLand(Land land) {
        this.land = land;
    }

    public Type getTypeOfBulding() {
        return typeOfBulding;
    }

    public void setTypeOfBulding(Type typeOfBulding) {
        this.typeOfBulding = typeOfBulding;
    }

    @Override
    public int compareTo(Building building) {
        return id-building.getId();
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object object){
        boolean answer=false;
        if(this.getClass()==object.getClass()){
        Building building=(Building) object;
        answer= id.equals(building.getId());}
        return answer;
    }

    @Override
    public int hashCode(){
        return id*11;
    }
}
