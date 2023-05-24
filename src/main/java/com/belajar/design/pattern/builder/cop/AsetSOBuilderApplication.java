package com.belajar.design.pattern.builder.cop;

import com.belajar.design.pattern.prototype.cop.AsetStockOpname;
import com.belajar.design.pattern.prototype.cop.FlagCabangUkkp;
import com.belajar.design.pattern.prototype.cop.StatusStockOpname;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class AsetSOBuilderApplication {

    @Bean
    @Scope("prototype")
    public AsetStockOpname asetSOBelumDitemukan(){
        return AsetStockOpname.builder()
                .statusStockOpname(StatusStockOpname.NOT_FOUND)
                .build();
    }

    @Bean
    @Scope("prototype")
    public AsetStockOpname asetSODitemukanDiCabangLain(){
        return AsetStockOpname.builder()
                .statusStockOpname(StatusStockOpname.NOT_FOUND)
                .flagCabangUkkp(FlagCabangUkkp.FOUND_ELSEWHERE)
                .build();
    }

    @Bean
    @Scope("prototype")
    public AsetStockOpname asetSODitemukanOlehCabangLain(){
        return AsetStockOpname.builder()
                .statusStockOpname(StatusStockOpname.NOT_REGIS)
                .flagCabangUkkp(FlagCabangUkkp.BELONG_OTHERS)
                .build();
    }

    @Bean
    @Scope("prototype")
    public AsetStockOpname asetSOInputanUser(){
        return AsetStockOpname.builder()
                .statusStockOpname(StatusStockOpname.NOT_REGIS)
                .flagCabangUkkp(FlagCabangUkkp.EXACT)
                .build();
    }

    @Bean
    @Scope("prototype")
    public AsetStockOpname asetSOTetapCocok(){
        return AsetStockOpname.builder()
                .statusStockOpname(StatusStockOpname.MATCH)
                .flagCabangUkkp(FlagCabangUkkp.EXACT)
                .build();
    }
}
