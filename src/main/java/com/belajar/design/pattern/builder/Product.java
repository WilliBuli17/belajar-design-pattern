package com.belajar.design.pattern.builder;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {

    private Long id;
    private String name;
    private String sku;
    private Long price;
    private Category category;
}
