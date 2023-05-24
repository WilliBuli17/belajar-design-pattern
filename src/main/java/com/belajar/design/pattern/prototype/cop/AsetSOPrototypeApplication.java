package com.belajar.design.pattern.prototype.cop;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class AsetSOPrototypeApplication {

    @Bean
    @Scope("prototype")
    public AsetStockOpname asetSOBelumDitemukan(){
        AsetStockOpname asetStockOpname = new AsetStockOpname();
        asetStockOpname.setStatusStockOpname(StatusStockOpname.NOT_FOUND);

        return asetStockOpname;
    }

    @Bean
    @Scope("prototype")
    public AsetStockOpname asetSODitemukanDiCabangLain(){
        AsetStockOpname asetStockOpname = new AsetStockOpname();
        asetStockOpname.setStatusStockOpname(StatusStockOpname.NOT_FOUND);
        asetStockOpname.setFlagCabangUkkp(FlagCabangUkkp.FOUND_ELSEWHERE);

        return asetStockOpname;
    }

    @Bean
    @Scope("prototype")
    public AsetStockOpname asetSODitemukanOlehCabangLain(){
        AsetStockOpname asetStockOpname = new AsetStockOpname();
        asetStockOpname.setStatusStockOpname(StatusStockOpname.NOT_REGIS);
        asetStockOpname.setFlagCabangUkkp(FlagCabangUkkp.BELONG_OTHERS);

        return asetStockOpname;
    }

    @Bean
    @Scope("prototype")
    public AsetStockOpname asetSOInputanUser(){
        AsetStockOpname asetStockOpname = new AsetStockOpname();
        asetStockOpname.setStatusStockOpname(StatusStockOpname.NOT_REGIS);
        asetStockOpname.setFlagCabangUkkp(FlagCabangUkkp.EXACT);

        return asetStockOpname;
    }

    @Bean
    @Scope("prototype")
    public AsetStockOpname asetSOTetapCocok(){
        AsetStockOpname asetStockOpname = new AsetStockOpname();
        asetStockOpname.setStatusStockOpname(StatusStockOpname.MATCH);
        asetStockOpname.setFlagCabangUkkp(FlagCabangUkkp.EXACT);

        return asetStockOpname;
    }
}
