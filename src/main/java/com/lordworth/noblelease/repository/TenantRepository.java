package com.lordworth.noblelease.repository;

import com.lordworth.noblelease.domain.Tenant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantRepository extends CrudRepository<Tenant,Integer> {
}
