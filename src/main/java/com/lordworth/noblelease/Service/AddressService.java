package com.lordworth.noblelease.Service;

import com.lordworth.noblelease.Service.Exceptions.AddressException;
import com.lordworth.noblelease.domain.Address;

import java.util.Set;

public interface AddressService {
    //Query
    public Set<Address> getAddressByVillage(String village) throws AddressException;
    public Address getAddressById(Integer addressId) throws AddressException;
    public Set<Address> getAddressByProperty(String property);


    //Command
    public void addAddress(Address address) throws AddressException;
    public void editAddress(Integer addressId, String addressProperty, Object newValue) throws AddressException;
    public void removeAddress(Integer addressId) throws AddressException;

}
