package com.lordworth.noblelease.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Bill implements Serializable,Comparable<Bill> {

    @Id
    private Integer id;
    @OneToOne
    private Tenant tenant;
    @OneToOne
    private Apartment apartment;
    private Date startDate;
    private Date dueDate;
    private Float arrears;

    public Float getArrears() {
        return arrears;
    }

    public void setArrears(Float arrears) {
        this.arrears = arrears;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public int compareTo(Bill bill) {
        return id-bill.getId();
    }

    @Override
    public String toString(){
        return "$"+apartment.getPrice();
    }

    @Override
    public boolean equals(Object object){
        boolean answer=false;
        if(this.getClass()==object.getClass()){
            Bill bill=(Bill) object;
            answer =id.equals(bill.getId());
        }
        return answer;
    }

    @Override
    public int hashCode(){
        return id*11;
    }
}
