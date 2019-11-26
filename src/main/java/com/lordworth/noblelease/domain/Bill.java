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
    @OneToOne
    private Price price;
    private Date startDate;
    private Date dueDate;
    private Boolean isCleared;
    private Integer daysBilled;

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

    public Boolean getCleared() {
        return isCleared;
    }

    public void setCleared(Boolean cleared) {
        isCleared = cleared;
    }
    public Integer getDaysBilled() {
        return daysBilled;
    }

    public void setDaysBilled(Integer daysBilled) {
        this.daysBilled = daysBilled;
    }

    @Override
    public int compareTo(Bill bill) {
        return id-bill.getId();
    }

    @Override
    public String toString(){
        return "$"+price.getAmount()+" owed by "+tenant+" apt:"+apartment.getId();
    }

    @Override
    public boolean equals(Object object){
        Bill bill=(Bill) object;
        return id.equals(bill.getId());
    }

    @Override
    public int hashCode(){
        return id*11;
    }
}
