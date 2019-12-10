package com.lordworth.noblelease.Service;

import com.lordworth.noblelease.Service.Exceptions.BillException;
import com.lordworth.noblelease.domain.Bill;

import java.util.Date;
import java.util.Set;

public interface BillService {

    //Query
    public Bill getBill(Integer billId) throws BillException;
    public Set<Bill> getBillByTenant(Integer tenantId) throws BillException;
    public Set<Bill> getBillByApartment(Integer apartmentId) throws BillException;
    public Set<Bill> getBillByArrears() throws BillException;
    public Set<Bill> getBillByDate(Date date) throws BillException;
    public Set<Bill> getBillByProperty(String property);

    //Command
    public void addBill(Bill bill) throws BillException;
    public void editBill(Bill bill, String property, Object value) throws BillException;
    public Bill removeBill(Integer billId) throws BillException;
}
