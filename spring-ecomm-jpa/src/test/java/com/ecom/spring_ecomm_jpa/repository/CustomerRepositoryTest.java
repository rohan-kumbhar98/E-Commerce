package com.ecom.spring_ecomm_jpa.repository;

import com.ecom.spring_ecomm_jpa.entity.Address;
import com.ecom.spring_ecomm_jpa.entity.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Date;
import java.util.List;

@DataJpaTest
class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    void testSaveCustomer() {
        Address address = Address.builder()
                .street("123 Main Street")
                .city("Whitefield")
                .state("IL")
                .zip("62701")
                .build();

        Customer customer = Customer.builder()
                .customerName("John")
                .customerEmail("john@gmail.com")
                .customerMob("1234567890")
                .customerGender("Male")
                .customerDOB(new Date())
                .address(address)
                .build();

        Customer savedCustomer = customerRepository.save(customer);

        System.out.println("--savedCustomer.getCustomerId() + " + "savedCustomer.getCustomerGender()" +
                "savedCustomer.getCustomerName() = " +
                savedCustomer.getCustomerId() +
                savedCustomer.getCustomerName() +
                savedCustomer.getCustomerGender());
    }

    @Test
    public void testFindAllCustomers() {
        List<Customer> customerList = customerRepository.findAll();


        System.out.println("customerList = " + customerList);
    }

    @Test
    public void testFindByCustomerName() {
        List<Customer> customerList = customerRepository.findByCustomerName("John");

        System.out.println("customerList = " + customerList);
    }

    @Test
    public void testFindByCustomerMob() {
        List<Customer> customerList = customerRepository.findByCustomerMob("1234567890");

        System.out.println("customerList = " + customerList);
    }

    @Test
    public void testFindByCustomerGender() {
        List<Customer> customerList = customerRepository.findByCustomerGender("Male");

        System.out.println("customerList = " + customerList);
    }
}