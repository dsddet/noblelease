package com.lordworth.noblelease.Service;

import com.lordworth.noblelease.domain.Role;
import com.lordworth.noblelease.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role getRoleById(Integer roleId) {
        return null;
    }

    @Override
    public Role getRoleByDescription(String roleName) {
        return null;
    }

    @Override
    public void addRole(Role role) {

    }

    @Override
    public Role editRole(Integer roleId, String property, Object value) {
        return null;
    }

    @Override
    public Role removeRole(Integer roleId) {
        return null;
    }
}
