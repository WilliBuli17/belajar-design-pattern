package com.belajar.design.pattern.prototype.cop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = AsetSOPrototypeApplication.class)
class AsetSOPrototypeApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testAsetSOPrototype() {
        AsetStockOpname kursi = applicationContext.getBean("asetSOBelumDitemukan", AsetStockOpname.class);
        kursi.setNomorStockOpname("SO/2022/00001");
        kursi.setNomorAset("11111111111");
        kursi.setSubNomorAset("0000");
        kursi.setNamaAset("kursi kantor");
        kursi.setNomorBarcode("11111111");

        System.out.println(kursi);
    }
}