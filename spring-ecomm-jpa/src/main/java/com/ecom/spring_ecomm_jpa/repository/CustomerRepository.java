package com.ecom.spring_ecomm_jpa.repository;

import com.ecom.spring_ecomm_jpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByCustomerName(String customerName);

    List<Customer> findByCustomerEmail(String customerEmail);

    List<Customer> findByCustomerMob(String customerMob);

    List<Customer> findByCustomerGender(String customerGender);

}
