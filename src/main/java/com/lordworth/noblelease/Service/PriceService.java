package com.lordworth.noblelease.Service;

import com.lordworth.noblelease.domain.Apartment;
import com.lordworth.noblelease.domain.Price;

import java.util.Date;
import java.util.List;
import java.util.Set;

public interface PriceService {

    //Query
    public Price getPriceById(Integer priceIid);
    public Set<Price> getPriceByAmount(Float amount);
    public Set<Price> getPriceByDate(Date startDate, Date endDate);
    public Set<Apartment> getApartmentsatPrice(Integer priceId);
    public Set<Price> getPricesForApartmentIds(List<Integer> apartmentIds);
    public Set<Price> getPriceByPeroperty(String property);


    //Command
    public void addPrice(Price price);
    public Price editPrice(Integer priceId, String propertyName, Object value);
    public Price removePrice(Integer priceId);

}
