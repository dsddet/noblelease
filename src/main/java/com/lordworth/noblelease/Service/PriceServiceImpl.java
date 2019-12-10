package com.lordworth.noblelease.Service;

import com.lordworth.noblelease.domain.Apartment;
import com.lordworth.noblelease.domain.Price;
import com.lordworth.noblelease.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Service
public class PriceServiceImpl implements PriceService {
    @Autowired
    private PriceRepository priceRepository;

    @Override
    public Price getPriceById(Integer priceIid) {
        return null;
    }

    @Override
    public Set<Price> getPriceByAmount(Float amount) {
        return null;
    }

    @Override
    public Set<Price> getPriceByDate(Date startDate, Date endDate) {
        return null;
    }

    @Override
    public Set<Apartment> getApartmentsatPrice(Integer priceId) {
        return null;
    }

    @Override
    public Set<Price> getPricesForApartmentIds(List<Integer> apartmentIds) {
        return null;
    }

    @Override
    public Set<Price> getPriceByPeroperty(String property) {
        return null;
    }

    @Override
    public void addPrice(Price price) {

    }

    @Override
    public Price editPrice(Integer priceId, String propertyName, Object value) {
        return null;
    }

    @Override
    public Price removePrice(Integer priceId) {
        return null;
    }
}
