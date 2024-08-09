package com.ecom.spring_ecomm_jpa.service;

import com.ecom.spring_ecomm_jpa.entity.Customer;
import com.ecom.spring_ecomm_jpa.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findByCustomerName(String customerName) {
        return customerRepository.findByCustomerName(customerName);
    }

    @Override
    public List<Customer> findByCustomerEmail(String customerEmail) {
        return customerRepository.findByCustomerEmail(customerEmail);
    }

    @Override
    public List<Customer> findByCustomerMob(String customerMob) {
        return customerRepository.findByCustomerMob(customerMob);
    }

    @Override
    public List<Customer> findByCustomerGender(String customerGender) {
        return customerRepository.findByCustomerGender(customerGender);
    }

    @Override
    public Customer saveOrUpdateCustomer(Customer customer) {
        Customer savedCustomer = null;
        customer = customerRepository.save(customer);
        return savedCustomer;
    }

    @Override
    public Customer getByCustomerId(Long customerId) {
        Optional<Customer> customerOptional = customerRepository.findById(customerId);
        Customer customer = customerOptional.orElse(null);
        return customer;
    }
}
