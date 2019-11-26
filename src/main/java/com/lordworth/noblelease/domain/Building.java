package com.lordworth.noblelease.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Building implements Serializable,Comparable<Building> {
    @Id
    private Integer id;
    private String name;
    @ManyToOne
    private Land land;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Building_id")
    private List<Apartment> apartmentList;
    @OneToOne
    private Category category;

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

    public List<Apartment> getApartmentList() {
        return apartmentList;
    }

    public void setApartmentList(List<Apartment> apartmentList) {
        this.apartmentList = apartmentList;
    }

    public void addApartmentList(Apartment apartment) {
        this.apartmentList.add(apartment);
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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
        Building building=(Building) object;
        return id.equals(building.getId());
    }

    @Override
    public int hashCode(){
        return id*11;
    }
}
