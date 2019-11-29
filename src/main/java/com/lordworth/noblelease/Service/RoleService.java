package com.lordworth.noblelease.Service;

import com.lordworth.noblelease.domain.Role;

public interface RoleService {
    //Query
    public Role getRoleById(Integer roleId);
    public Role getRoleByDescription(String roleName);


    //Command
    public void addRole(Role role);
    public Role editRole(Integer roleId,String property, Object value);
    public Role removeRole(Integer roleId);
}
