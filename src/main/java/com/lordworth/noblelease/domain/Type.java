package com.lordworth.noblelease.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Type implements Serializable,Comparable<Type> {
    @Id
    private String id;
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int compareTo(Type type) {
        return id.compareTo(type.getId());
    }

    @Override
    public String toString(){
        return description;
    }

    @Override
    public boolean equals(Object object){
        boolean answer=false;
        if(this.getClass()==object.getClass()){
        Type type =(Type) object;
        answer= id.equals(type.getId());}
        return answer;
    }

    @Override
    public int hashCode(){
        return id.hashCode()*11;
    }

}
