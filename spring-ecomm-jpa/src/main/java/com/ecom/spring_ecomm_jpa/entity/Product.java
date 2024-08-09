package com.ecom.spring_ecomm_jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue
    private Long productId;

    private String productName;

    private String productShortName;

    private String productDescription;

    @Column(unique = true)
    private String productCode;

    @ElementCollection
    @CollectionTable(name = "product_selling_units", joinColumns = @JoinColumn(name = "product_id"))
    private List<SellingUnit> sellingUnits;
}
