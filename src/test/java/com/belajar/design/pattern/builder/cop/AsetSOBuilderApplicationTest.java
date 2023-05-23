package com.belajar.design.pattern.builder.cop;

import com.belajar.design.pattern.prototype.cop.AsetStockOpname;
import com.belajar.design.pattern.prototype.cop.FlagCabangUkkp;
import com.belajar.design.pattern.prototype.cop.StatusStockOpname;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = AsetSOBuilderApplication.class)
class AsetSOBuilderApplicationTest {


    @Autowired
    public ApplicationContext applicationContext;

    @Test
    void testAsetSOBuilder() {
        AsetStockOpname meja = AsetStockOpname.builder()
                .nomorStockOpname("S0/2022/00002")
                .nomorAset("2222222222222")
                .subNomorAset("0000")
                .namaAset("meja kerja")
                .nomorBarcode("22222")
                .statusStockOpname(StatusStockOpname.MATCH)
                .flagCabangUkkp(FlagCabangUkkp.FOUND_ELSEWHERE)
                .build();

        System.out.println(meja);
    }

    @Test
    void testProductBuilderPrototype() {
        AsetStockOpname kursi = applicationContext.getBean("asetSOTetapCocok", AsetStockOpname.class);
        kursi.setNomorStockOpname("SO/2022/00001");
        kursi.setNomorAset("11111111111");
        kursi.setSubNomorAset("0000");
        kursi.setNamaAset("kursi kantor");
        kursi.setNomorBarcode("11111111");

        System.out.println(kursi);
    }
}