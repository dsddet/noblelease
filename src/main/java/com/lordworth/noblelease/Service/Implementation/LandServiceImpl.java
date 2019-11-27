package com.lordworth.noblelease.Service.Implementation;

import com.lordworth.noblelease.repository.LandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LandServiceImpl implements LandService {
    @Autowired
    private LandRepository landRepository;
}
