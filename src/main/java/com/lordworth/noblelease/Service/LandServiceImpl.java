package com.lordworth.noblelease.Service;

import com.lordworth.noblelease.domain.Land;
import com.lordworth.noblelease.repository.LandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class LandServiceImpl implements LandService {
    @Autowired
    private LandRepository landRepository;

    @Override
    public Set<Land> getLandByIds() {
        return null;
    }

    @Override
    public Land getLandByAddress(Integer addressId) {
        return null;
    }

    @Override
    public Land getLandById(Integer landId) {
        return null;
    }

    @Override
    public Set<Land> getLandByPeroperty(String property) {
        return null;
    }

    @Override
    public void addLand(Land land) {

    }

    @Override
    public Land removeLand(Integer id) {
        return null;
    }

    @Override
    public Land editLand(Integer id, String property, Object value) {
        return null;
    }
}
