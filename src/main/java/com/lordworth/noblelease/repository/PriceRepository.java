package com.lordworth.noblelease.repository;

import com.lordworth.noblelease.domain.Price;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends CrudRepository<Price,Integer> {
}
