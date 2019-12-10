package com.lordworth.noblelease.repository;

import com.lordworth.noblelease.domain.Apartment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ApartmentRepository extends CrudRepository<Apartment,Integer> {
}
