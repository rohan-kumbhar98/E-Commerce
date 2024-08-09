package com.ecom.spring_ecomm_jpa.service;

import com.ecom.spring_ecomm_jpa.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findByCustomerName(String customerName);

    List<Customer> findByCustomerEmail(String customerEmail);

    List<Customer> findByCustomerMob(String customerMob);

    List<Customer> findByCustomerGender(String customerGender);

    Customer saveOrUpdateCustomer(Customer customer);

    Customer getByCustomerId(Long customerId);

}
