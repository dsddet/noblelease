package com.lordworth.noblelease.Service;

import com.lordworth.noblelease.domain.Apartment;
import com.lordworth.noblelease.domain.Tenant;


import java.util.List;
import java.util.Set;

public interface ApartmentService {
    //Query
    public Apartment getApartment(Integer apartmentId);
    public Set<Tenant> getApartmentsByTenant(Integer tenantId);
    public Set<Apartment> getApartmentsByTenants(List<Integer> tenantIds);
    public Set<Apartment> getApartmentsByRange(Integer start,Integer end);
    public Set<Apartment> getApartmentsByBuilding(Integer buildingId);
    public Set<Apartment> getApartmentsByProperty(String propertyName);
    public Set<Apartment> getApartmentByPrice(Float price);

    //Command
    public void addApartment(Apartment apartment);
    public Apartment editApartment(Integer apartmentId,String propertyName,Object value);
    public Tenant removeApartment(Integer apartmentId);
}
