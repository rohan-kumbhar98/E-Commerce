package com.ecom.spring_ecomm_jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@AttributeOverrides({

        @AttributeOverride(
                name = "street",
                column = @Column(name = "address_street")
        ),
        @AttributeOverride(
                name = "city",
                column = @Column(name = "address_city")
        ), @AttributeOverride(
        name = "state",
        column = @Column(name = "address_state")
), @AttributeOverride(
        name = "zip",
        column = @Column(name = "address_zip")
),
})
public class Address {

    private String street;
    private String city;
    private String state;
    private String zip;

}
