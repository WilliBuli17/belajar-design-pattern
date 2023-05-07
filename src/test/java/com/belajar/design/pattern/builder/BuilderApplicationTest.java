package com.belajar.design.pattern.builder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = BuilderApplication.class)
class BuilderApplicationTest {

    @Autowired
    public ApplicationContext applicationContext;

    @Test
    void testBuilderPrototype() {
        Product product = applicationContext.getBean("productGadget", Product.class);
        product.setName("Laptop 15 inch");
        product.setPrice(23_000_000L);

        System.out.println(product);
    }
}