package com.lordworth.noblelease.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Apartment implements Serializable,Comparable<Apartment> {
    @Id
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Building building;
    @ManyToOne(fetch = FetchType.LAZY)
    private Tenant tenant;
    @OneToOne
    private Price price;

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

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

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
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
        boolean answer=false;
        if(this.getClass()==object.getClass()){
            Apartment apartment=(Apartment) object;
            answer= (building.getName().length()+id)==(apartment.getBuilding().getName().length()+apartment.getId());
        }
        return answer;
    }

    @Override
    public int hashCode(){
        return id*building.getName().length()*11;
    }
}
