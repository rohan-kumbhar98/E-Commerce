package com.ecom.spring_ecomm_jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        name = "customer",
        uniqueConstraints = @UniqueConstraint(
                name = "emailId_unique",
                columnNames = "customerEmail "
        )
)
public class Customer {

    @Id
    @GeneratedValue
    private Long customerId;

    private String customerName;


    @Column(
            name = "email_address",
            nullable = false
    )
    private String customerEmail;

    private String customerMob;
    private String customerGender;
    private Date customerDOB;

    @Embedded
    private Address address;

}
