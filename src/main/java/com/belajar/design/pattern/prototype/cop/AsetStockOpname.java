package com.belajar.design.pattern.prototype.cop;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AsetStockOpname {

    private Long id;
    private String nomorStockOpname;
    private String nomorAset;
    private String subNomorAset;
    private String namaAset;
    private String nomorBarcode;
    private StatusStockOpname statusStockOpname;
    private FlagCabangUkkp flagCabangUkkp;
}
