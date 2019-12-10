package com.lordworth.noblelease.Service;

import com.lordworth.noblelease.domain.Type;
import com.lordworth.noblelease.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeServiceImpl implements TypeService{
    @Autowired
    private TypeRepository typeRepository;

    @Override
    public Type getRoleById(Integer roleId) {
        return null;
    }

    @Override
    public Type getRoleByDescription(String roleName) {
        return null;
    }

    @Override
    public void addRole(Type type) {

    }

    @Override
    public Type editRole(Integer roleId, String property, Object value) {
        return null;
    }

    @Override
    public Type removeRole(Integer roleId) {
        return null;
    }
}
