package com.ecom.spring_ecomm_jpa.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SellingUnit {

    private String sellingUnitCode;
    private String sellingUnitName;
    private String sellingUnitDesc;
}
