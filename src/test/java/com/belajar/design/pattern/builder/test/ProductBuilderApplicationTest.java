package com.belajar.design.pattern.builder.test;

import com.belajar.design.pattern.builder.test.Product;
import com.belajar.design.pattern.builder.test.ProductBuilderApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = ProductBuilderApplication.class)
class ProductBuilderApplicationTest {

    @Autowired
    public ApplicationContext applicationContext;

    @Test
    void testProductBuilder() {
        Product iphone = Product.builder()
                .name("Iphone")
                .price(13_000_000L)
                .sku("XXX")
                .build();

        System.out.println(iphone);
    }

    @Test
    void testProductBuilderPrototype() {
        Product product = applicationContext.getBean("productGadget", Product.class);
        product.setName("Laptop 15 inch");
        product.setPrice(23_000_000L);

        System.out.println(product);
    }
}