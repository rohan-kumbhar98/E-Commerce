package com.ecom.spring_ecomm_jpa.controller;

import com.ecom.spring_ecomm_jpa.entity.Customer;
import com.ecom.spring_ecomm_jpa.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public String CustomerPage() {
        return "you are on customer controller";
    }

    @GetMapping("/name/{customerName}")
    public List<Customer> findCustomersByCustomerName(@PathVariable String customerName) {
        List<Customer> customers = customerService.findByCustomerName(customerName);
        return customers;
    }

    @PostMapping("/")
    public Customer saveOrUpdateCustomer(@RequestBody Customer customer) {
        return customerService.saveOrUpdateCustomer(customer);
    }

    @GetMapping("/id/{customerId}")
    public Customer findCustomersById(@PathVariable Long customerId) {
        return customerService.getByCustomerId(customerId);
    }
}
