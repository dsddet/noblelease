package com.lordworth.noblelease.Service;

import com.lordworth.noblelease.domain.Building;
import com.lordworth.noblelease.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Service
public class BuildingServiceImpl implements BuildingService {
    @Autowired
    private BillRepository billRepository;


    @Override
    public Set<Building> getBuildingsByLand(Integer landId) {
        return null;
    }

    @Override
    public Set<Building> getBuildingsByType(String buildingType) {
        return null;
    }

    @Override
    public Set<Building> getBuildingsById(List<Integer> buildingIds) {
        return null;
    }

    @Override
    public Set<Building> getBuildingsByApartments(List<Integer> apartmentIds) {
        return null;
    }

    @Override
    public Building getBuilding(Integer buildingId) {
        return null;
    }

    @Override
    public Set<Building> getBuildingByProperty(String property) {
        return null;
    }

    @Override
    public void AddBuilding(Building building) {

    }

    @Override
    public void editBuilding(Integer buidlingId, String property, Object value) {

    }

    @Override
    public void removeBuilding(Integer buildingId) {

    }
}
