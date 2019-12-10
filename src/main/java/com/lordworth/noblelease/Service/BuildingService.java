package com.lordworth.noblelease.Service;

import com.lordworth.noblelease.domain.Building;

import java.util.List;
import java.util.Set;

public interface BuildingService {
    //Query
    public Set<Building> getBuildingsByLand(Integer landId);
    public Set<Building> getBuildingsByType(String buildingType);
    public Set<Building> getBuildingsById(List<Integer> buildingIds);
    public Set<Building> getBuildingsByApartments(List<Integer> apartmentIds);
    public Building getBuilding(Integer buildingId);
    public Set<Building> getBuildingByProperty(String property);



    //Command

    public void AddBuilding(Building building);
    public void editBuilding(Integer buidlingId,String property, Object value);
    public void removeBuilding(Integer buildingId);

}
