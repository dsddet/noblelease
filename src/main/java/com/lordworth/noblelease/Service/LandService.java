package com.lordworth.noblelease.Service;

import com.lordworth.noblelease.domain.Land;

import java.util.Set;

public interface LandService {
    public Set<Land> getLandByIds();
    public Land getLandByAddress(Integer addressId);
    public Land getLandById(Integer landId);
    public Set<Land> getLandByPeroperty(String property);

    public void addLand(Land land);
    public Land removeLand(Integer id);
    public Land editLand(Integer id, String property, Object value);





}
