package com.lordworth.noblelease.repository;

import com.lordworth.noblelease.domain.Type;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends CrudRepository<Type,Integer> {
}
