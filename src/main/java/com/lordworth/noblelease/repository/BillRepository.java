package com.lordworth.noblelease.repository;

import com.lordworth.noblelease.domain.Bill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends CrudRepository<Bill,Integer> {
}
