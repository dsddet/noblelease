package com.lordworth.noblelease.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
public class Land implements Serializable, Comparable<Land> {
    @Id
    private Integer id;
    private Float length;
    private Float width;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="land_id")
    private Set<Building> buildingSet;
    @OneToOne
    private Address address;
    private Integer landTitleId;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Set<Building> getBuildingSet() {
        return buildingSet;
    }

    public void setBuildingSet(Set<Building> buildingSet) {
        this.buildingSet = buildingSet;
    }

    public void addToBuildingSet(Building building) {
        this.buildingSet.add(building);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getLandTitleId() {
        return landTitleId;
    }

    public void setLandTitleId(Integer landTitleId) {
        this.landTitleId = landTitleId;
    }

    @Override
    public int compareTo(Land land) {
        return id-land.getId();
    }

    @Override
    public String toString(){
        return description+" In "+address;
    }

    @Override
    public boolean equals(Object object){
        boolean answer=false;
        if(this.getClass()==object.getClass()){
            Land land=(Land) object;
            answer= id==land.getId();}
        return answer;
    }

    @Override
    public int hashCode(){
        return id*11;
    }
}
