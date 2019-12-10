package com.lordworth.noblelease.Service;


import com.lordworth.noblelease.Service.Exceptions.TenantException;
import com.lordworth.noblelease.domain.Tenant;
import com.lordworth.noblelease.repository.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class TenantServiceImpl implements TenantService {
    @Autowired
    private TenantRepository tenantRepository;

    @Override
    public Set<Tenant> getTenantsByBuilding(Integer buildingId) throws TenantException {
        return null;
    }

    @Override
    public Set<Tenant> getTenantsByLand(Integer landId) throws TenantException {
        return null;
    }

    @Override
    public List<Tenant> getTenantsByIds(List<Integer> tenantIds) throws TenantException {
        return null;
    }

    @Override
    public Set<Tenant> getTenantsByType(String buildingType) throws TenantException {
        return null;
    }


    @Override
    public Set<Tenant> getTenantsByAddress(Integer id) throws TenantException {
        return null;
    }

    @Override
    public Tenant getTenantByApartment(Integer apartmentId) throws TenantException {
        return null;
    }

    @Override
    public Tenant getTenantById(Integer id) throws TenantException {
        return null;
    }

    @Override
    public Set<Tenant> getTenantByProperty(String property, Object propertyValue) {
        return null;
    }


    @Override
    public void addTenant(Tenant tenant) throws TenantException {

    }

    @Override
    public void editTenant(Tenant tenant) {

    }


    @Override
    public Tenant removeTenant(Integer tenantId) throws TenantException {
        return null;
    }
}


/*

add tenant
assign apartment
modify tenant
remove tenant
email tenant
remove tenant

 */