package com.lordworth.noblelease.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class Apartment implements Serializable,Comparable<Apartment> {
    @Id
    private Integer id;
    @ManyToOne
    private Building building;
    private Boolean isOccupied;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public Boolean getOccupied() {
        return isOccupied;
    }

    public void setOccupied(Boolean occupied) {
        isOccupied = occupied;
    }

    @Override
    public int compareTo( Apartment apartment) {
        return apartment.getId()+building.getId()-apartment.getId()-apartment.getBuilding().getId();
    }

    @Override
    public String toString(){
        return building.getName()+"-"+id;
    }

    @Override
    public boolean equals(Object object){
        Apartment apartment=(Apartment) object;
        return (building.getName().length()+id)==(apartment.getBuilding().getName().length()+apartment.getId());
    }

    @Override
    public int hashCode(){
        return id*building.getName().length()*11;
    }
}
