package com.lordworth.noblelease.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Bill implements Serializable {

    @Id
    private Integer id;
    @OneToOne
    private Tenant tenant;
    @OneToOne
    private Apartment apartment;
    private Integer priceId;
    private Date startDate;
    private Date dueDate;
    private Boolean isCleared;
    private Integer daysBilled;



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

    public Integer getPriceId() {
        return priceId;
    }

    public void setPriceId(Integer priceId) {
        this.priceId = priceId;
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
}
