package com.lordworth.noblelease.controller;

import com.lordworth.noblelease.Service.Exceptions.TenantException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationControllerAdvice {

    @ExceptionHandler({TenantException.class,Exception.class})
    public String handleTenantException(Exception ex) {
        return "Exception Occured in Tenant, needs handling";
    }
}
