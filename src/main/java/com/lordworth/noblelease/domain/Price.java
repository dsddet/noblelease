package com.lordworth.noblelease.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Price implements Serializable {
    @Id
    private Integer id;
    private Float amount;
    private Date startDate;
    private Date endDate;
    @OneToOne
    private Apartment apartment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

}
