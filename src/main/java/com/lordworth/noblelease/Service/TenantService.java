package com.lordworth.noblelease.Service;

import com.lordworth.noblelease.Service.Exceptions.TenantException;
import com.lordworth.noblelease.domain.Tenant;
import java.util.List;
import java.util.Set;

public interface TenantService {
//Query
    public Set<Tenant> getTenantsByBuilding(Integer buildingId) throws TenantException;
    public Set<Tenant> getTenantsByLand(Integer landId) throws TenantException;
    public List<Tenant> getTenantsByIds(List<Integer> tenantIds) throws TenantException;
    public Set<Tenant> getTenantsByType(String buildingType) throws TenantException;
    public Set<Tenant> getTenantsByPrice(Integer id) throws TenantException;
    public Set<Tenant> getTenantsByAddress(Integer id) throws TenantException;
    public Tenant getTenantByApartment(Integer apartmentId) throws TenantException;
    public Tenant getTenantById(Integer id) throws TenantException;
    public Object getTenantProperty(Integer tenantId,String property) throws TenantException;
    public Set<Tenant> getTenantByProperty(String property);

//Command
    public void addTenant(Tenant tenant) throws TenantException;
    public void editTenant(Integer tenantId,String propertyToChange,Object newValue) throws TenantException;
    public Tenant removeTenant(Integer tenantId) throws TenantException;

}
