package com.lordworth.noblelease.Service;

import com.lordworth.noblelease.domain.Type;

public interface TypeService {
    //Query
    public Type getRoleById(Integer roleId);
    public Type getRoleByDescription(String roleName);


    //Command
    public void addRole(Type type);
    public Type editRole(Integer roleId,String property, Object value);
    public Type removeRole(Integer roleId);
}
