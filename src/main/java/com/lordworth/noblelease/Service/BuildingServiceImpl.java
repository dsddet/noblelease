package com.lordworth.noblelease.Service;

import com.lordworth.noblelease.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuildingServiceImpl implements BillService {
    @Autowired
    private BillRepository billRepository;
}