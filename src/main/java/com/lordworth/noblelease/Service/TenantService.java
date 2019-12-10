package com.lordworth.noblelease.Service;

import com.lordworth.noblelease.Service.Exceptions.TenantException;
import com.lordworth.noblelease.domain.Tenant;
import java.util.List;
import java.util.Set;

public interface TenantService {
//Query
    public Set<Tenant> getTenantsByBuilding(Integer buildingId) throws TenantException; // To Buildings->apartmentIds, Apartments->TenantIds.., Tenants
    public Set<Tenant> getTenantsByLand(Integer landId) throws TenantException; //To Land->buildingIds, Buildings->apartmentIds, Apartments->TenantIds.., tenants
    public List<Tenant> getTenantsByIds(List<Integer> tenantIds) throws TenantException; //To Tenants
    public Set<Tenant> getTenantsByType(String buildingType) throws TenantException; //To Buildings->apartmentIds, Apartments->TenantIds.., Tenants
//  public Set<Tenant> getTenantsByPrice(Float minValue, Float maxValue) ; //To prices->priceIds, Apartments->TenantIds.., Tenants
    public Set<Tenant> getTenantsByAddress(Integer id) throws TenantException; //To address -> addressId, Buildings->ApartmentsIds, Apartments-> tenantIds.., Tenants
    public Tenant getTenantByApartment(Integer apartmentId) throws TenantException; //To Apartments->tenantId.., Tenants
    public Tenant getTenantById(Integer id) throws TenantException;
//    public Object getTenantProperty(Integer tenantId,String property) ;
      public Set<Tenant> getTenantByProperty(String property,Object propertyValue);

//Command
    public void addTenant(Tenant tenant) throws TenantException;
    public void editTenant(Tenant tenant) ;
    public Tenant removeTenant(Integer tenantId) throws TenantException;

}
