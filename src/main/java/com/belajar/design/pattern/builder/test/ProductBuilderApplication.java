package com.belajar.design.pattern.builder.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class ProductBuilderApplication {

    @Bean
    @Scope("prototype")
    public Product productGadget() {
        return Product.builder()
                .category(Category.GADGET)
                .build();
    }

    @Bean
    @Scope("prototype")
    public Product productFashion() {
        return Product.builder()
                .category(Category.FASHION)
                .build();
    }
}
