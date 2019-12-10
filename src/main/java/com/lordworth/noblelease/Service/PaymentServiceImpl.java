package com.lordworth.noblelease.Service;

import com.lordworth.noblelease.domain.Payment;
import com.lordworth.noblelease.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Set<Payment> getPaymentsById(List<Integer> idList) {
        return null;
    }

    @Override
    public Set<Payment> getPaymentsByTenant(Integer tenantId) {
        return null;
    }

    @Override
    public Set<Payment> getPaymentsByTenants(List<Integer> tenants) {
        return null;
    }

    @Override
    public Set<Payment> getPaymentsByPayDate(Date date) {
        return null;
    }

    @Override
    public Set<Payment> getPaymentsByIsProcessed(Boolean isProcessed) {
        return null;
    }

    @Override
    public Set<Payment> getPaymentsByAmount(Float amount) {
        return null;
    }

    @Override
    public Set<Payment> getPaymentsByApartment(Integer apartmentId) {
        return null;
    }

    @Override
    public Set<Payment> getPaymentsByApartments(List<Integer> apartmentIds) {
        return null;
    }

    @Override
    public Set<Payment> getPaymentsinDateRange(Date startDate, Date endDate) {
        return null;
    }

    @Override
    public Set<Payment> getPaymentByProperty(String property) {
        return null;
    }

    @Override
    public void addPayment(Payment payment) {

    }

    @Override
    public Payment editPayment(Integer paymentId, String propertyName, Object value) {
        return null;
    }

    @Override
    public Payment removePayment(Integer paymentId) {
        return null;
    }
}
