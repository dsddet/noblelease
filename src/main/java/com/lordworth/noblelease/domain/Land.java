package com.lordworth.noblelease.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

@Entity
public class Land implements Serializable {
    @Id
    private Integer id;
    private Float length;
    private Float width;
    private List<Building> buildingList;
    private Address address;
    private Integer landTitleId;

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

    public List<Building> getBuildingList() {
        return buildingList;
    }

    public void setBuildingList(List<Building> buildingList) {
        this.buildingList = buildingList;
    }

    public void addBuildingToList(Building building) {
        this.buildingList.add(building);
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
}
