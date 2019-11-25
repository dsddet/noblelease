package com.lordworth.noblelease.repository;

import com.lordworth.noblelease.domain.Land;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LandRepository extends CrudRepository<Land,Integer> {
}
