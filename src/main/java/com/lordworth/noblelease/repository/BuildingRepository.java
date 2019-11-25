package com.lordworth.noblelease.repository;

import com.lordworth.noblelease.domain.Building;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingRepository extends CrudRepository<Building,Integer> {
}
