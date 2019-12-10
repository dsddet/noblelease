package com.lordworth.noblelease.Service;

import com.lordworth.noblelease.Service.Exceptions.BillException;
import com.lordworth.noblelease.domain.Bill;
import com.lordworth.noblelease.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Set;

@Service
public class BillServiceImpl implements BillService {
    @Autowired
    private BillRepository billRepository;

    @Override
    public Bill getBill(Integer billId) throws BillException {
        return null;
    }

    @Override
    public Set<Bill> getBillByTenant(Integer tenantId) throws BillException {
        return null;
    }

    @Override
    public Set<Bill> getBillByApartment(Integer apartmentId) throws BillException {
        return null;
    }

    @Override
    public Set<Bill> getBillByArrears() throws BillException {
        return null;
    }

    @Override
    public Set<Bill> getBillByDate(Date date) throws BillException {
        return null;
    }

    @Override
    public Set<Bill> getBillByProperty(String property) {
        return null;
    }

    @Override
    public void addBill(Bill bill) throws BillException {

    }

    @Override
    public void editBill(Bill bill, String property, Object value) throws BillException {

    }

    @Override
    public Bill removeBill(Integer billId) throws BillException {
        return null;
    }
}
