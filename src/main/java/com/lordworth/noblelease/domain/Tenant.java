package com.lordworth.noblelease.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Tenant implements Serializable {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private Boolean isTenant;
    private Integer phoneNumber;
    private String email;
    private String governmentId;
    private Integer agreeementId;
    private Integer emegencyContact;
    private String emegencyContactRelationship;


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

    public Boolean getTenant() {
        return isTenant;
    }

    public void setTenant(Boolean tenant) {
        isTenant = tenant;
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

    public Integer getAgreeementId() {
        return agreeementId;
    }

    public void setAgreeementId(Integer agreeementId) {
        this.agreeementId = agreeementId;
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
}
