package com.lordworth.noblelease.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Role implements Serializable,Comparable<Role> {
    @Id
    private Integer id;
    private String description;
    private Date expirationDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public int compareTo(Role role) {
        return id-role.getId();
    }

    @Override
    public String toString(){
        return description;
    }

    @Override
    public boolean equals(Object object){
        boolean answer=false;
        if(this.getClass()==object.getClass()){
            Role role=(Role) object;
            answer= id==role.getId();
        }

        return answer;

    }

    @Override
    public int hashCode(){
        return id*11;
    }
}
