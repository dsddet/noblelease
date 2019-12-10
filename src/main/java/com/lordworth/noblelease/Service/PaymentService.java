package com.lordworth.noblelease.Service;

import com.lordworth.noblelease.domain.Payment;

import java.util.Date;
import java.util.List;
import java.util.Set;

public interface PaymentService {
    //Query
    public Set<Payment> getPaymentsById(List<Integer> idList);
    public Set<Payment> getPaymentsByTenant(Integer tenantId);
    public Set<Payment> getPaymentsByTenants(List<Integer> tenants);
    public Set<Payment> getPaymentsByPayDate(Date date);
    public Set<Payment> getPaymentsByIsProcessed(Boolean isProcessed);
    public Set<Payment> getPaymentsByAmount(Float amount);
    public Set<Payment> getPaymentsByApartment(Integer apartmentId);
    public Set<Payment> getPaymentsByApartments(List<Integer> apartmentIds);
    public Set<Payment> getPaymentsinDateRange(Date startDate,Date endDate);
    public Set<Payment> getPaymentByProperty(String property);

    //Command
    public void addPayment(Payment payment);
    public Payment editPayment(Integer paymentId, String propertyName, Object value);
    public Payment removePayment(Integer paymentId);


}
