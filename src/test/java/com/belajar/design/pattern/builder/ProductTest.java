package com.belajar.design.pattern.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testProductBuilder() {
        Product iphone = Product.builder()
                .name("Iphone")
                .price(13_000_000L)
                .sku("XXX")
                .build();

        System.out.println(iphone);
    }
}