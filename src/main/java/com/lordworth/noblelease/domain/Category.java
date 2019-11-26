package com.lordworth.noblelease.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Category implements Serializable,Comparable<Category> {
    @Id
    private Integer id;
    private String description;

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

    @Override
    public int compareTo(Category category) {
        return id-category.getId();
    }

    @Override
    public String toString(){
        return description;
    }

    @Override
    public boolean equals(Object object){
        Category category=(Category) object;
        return id==category.getId();
    }

    @Override
    public int hashCode(){
        return id*11;
    }

}
