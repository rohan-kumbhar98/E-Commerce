package com.ecom.spring_ecomm_jpa.repository;

import com.ecom.spring_ecomm_jpa.entity.Product;
import com.ecom.spring_ecomm_jpa.entity.SellingUnit;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;

@DataJpaTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testSaveProduct() {

        SellingUnit sellingUnit1 = SellingUnit.builder()
                .sellingUnitCode("SU01")
                .sellingUnitName("Small Size")
                .sellingUnitDesc("Small bowl")
                .build();

        SellingUnit sellingUnit2 = SellingUnit.builder()
                .sellingUnitCode("SU02")
                .sellingUnitName("Large Size")
                .sellingUnitDesc("Large bowl")
                .build();
        List<SellingUnit> sellUnits = new ArrayList<SellingUnit>();
        sellUnits.add(sellingUnit1);
        sellUnits.add(sellingUnit2);
        Product product = Product.builder()
                .productName("Bowl")
                .productShortName("Oval")
                .productDescription("Steel")
                .productCode("ST11")
                .sellingUnits(sellUnits)
                .build();

        Product savedProduct = productRepository.save(product);

    }

    @Test
    public void printAllProduct() {
        List<Product> productList = productRepository.findAll();
        System.out.println("productList = " + productList);
    }

    @Test
    public void printProductByProductName() {
        List<Product> productList = productRepository.findByProductName("Bowl");
        System.out.println("productList = " + productList);
    }

    @Test
    public void testFindProductByProductCode() {
        List<Product> productList = productRepository.findByProductCode("ST11");
        System.out.println("product = " + productList);
    }

    @Test
    public void testDeleteProduct() {
        Product product = productRepository.save(Product.builder()
                .productName("Plate")
                .productShortName("Round")
                .productDescription("Ceramic")
                .productCode("CT22")
                .build());

        Long productId = product.getProductId();
        productRepository.deleteById(productId);
    }
}