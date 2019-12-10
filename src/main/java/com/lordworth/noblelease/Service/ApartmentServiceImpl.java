package com.lordworth.noblelease.Service;

import com.lordworth.noblelease.domain.Apartment;
import com.lordworth.noblelease.domain.Tenant;
import com.lordworth.noblelease.repository.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class ApartmentServiceImpl implements ApartmentService {
    @Autowired
    private ApartmentRepository apartmentRepository;

    @Override
    public Apartment getApartment(Integer apartmentId) {
        return null;
    }

    @Override
    public Set<Tenant> getApartmentsByTenant(Integer tenantId) {
        return null;
    }

    @Override
    public Set<Apartment> getApartmentsByTenants(List<Integer> tenantIds) {
        return null;
    }

    @Override
    public Set<Apartment> getApartmentsByRange(Integer start, Integer end) {
        return null;
    }

    @Override
    public Set<Apartment> getApartmentsByBuilding(Integer buildingId) {
        return null;
    }

    @Override
    public Set<Apartment> getApartmentsByProperty(String propertyName) {
        return null;
    }

    @Override
    public Set<Apartment> getApartmentByPrice(Float price) {
        return null;
    }

    @Override
    public void addApartment(Apartment apartment) {

    }

    @Override
    public Apartment editApartment(Integer apartmentId, String propertyName, Object value) {
        return null;
    }

    @Override
    public Tenant removeApartment(Integer apartmentId) {
        return null;
    }
}
