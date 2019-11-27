package com.lordworth.noblelease.domain;

import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
public class Tenant implements Serializable,Comparable<Tenant> {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer phoneNumber;
    private String email;
    private String governmentId;
    private Integer emegencyContact;
    private String emegencyContactRelationship;
    private Date dateOfBirth;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "tenant_id",nullable = true)
    private Set<Apartment> apartmentSet;

    public Set<Apartment> getApartmentSet() {
        return apartmentSet;
    }

    public void setApartmentSet(Set<Apartment> apartmentSet) {
        this.apartmentSet = apartmentSet;
    }

    public void addApartmentSet(Apartment apartment) {
        apartmentSet.add(apartment);
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGovernmentId() {
        return governmentId;
    }

    public void setGovernmentId(String governmentId) {
        this.governmentId = governmentId;
    }

    public Integer getEmegencyContact() {
        return emegencyContact;
    }

    public void setEmegencyContact(Integer emegencyContact) {
        this.emegencyContact = emegencyContact;
    }

    public String getEmegencyContactRelationship() {
        return emegencyContactRelationship;
    }

    public void setEmegencyContactRelationship(String emegencyContactRelationship) {
        this.emegencyContactRelationship = emegencyContactRelationship;
    }

    @Override
    public int compareTo(Tenant tenant) {
        return id-tenant.getId();
    }

    @Override
    public String toString(){
        return firstName+" "+lastName;
    }

    @Override
    public boolean equals(Object object){
        boolean answer=false;
        if(this.getClass()==object.getClass()){
            Tenant tenant=(Tenant) object;
            answer= id.equals(tenant.getId());
        }
        return answer;
    }

    @Override
    public int hashCode(){
        return id*11;
    }
}
