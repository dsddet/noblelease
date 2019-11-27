package com.lordworth.noblelease.Service.Implementation;


import com.lordworth.noblelease.repository.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TenantServiceImpl implements TenantService {
    @Autowired
    private TenantRepository tenantRepository;
}


/*

add tenant
assign apartment
modify tenant
remove tenant
email tenant
remove tenant

 */