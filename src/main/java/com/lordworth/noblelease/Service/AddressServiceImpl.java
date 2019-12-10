package com.lordworth.noblelease.Service;

import com.lordworth.noblelease.Service.Exceptions.AddressException;
import com.lordworth.noblelease.domain.Address;
import com.lordworth.noblelease.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Set<Address> getAddressByVillage(String village) throws AddressException {
        return null;
    }

    @Override
    public Address getAddressById(Integer addressId) throws AddressException {
        return null;
    }

    @Override
    public Set<Address> getAddressByProperty(String property) {
        return null;
    }

    @Override
    public void addAddress(Address address) throws AddressException {

    }

    @Override
    public void editAddress(Integer addressId, String addressProperty, Object newValue) throws AddressException {

    }

    @Override
    public void removeAddress(Integer addressId) throws AddressException {

    }
}
