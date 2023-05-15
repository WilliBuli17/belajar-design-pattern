package com.belajar.design.pattern.abstract_fctory.gopay;

import com.belajar.design.pattern.abstract_fctory.ChargePaymentRequest;
import com.belajar.design.pattern.abstract_fctory.PaymentMethod;
import lombok.Data;

@Data
public class GopayCharge implements ChargePaymentRequest {

    private String id;
    private Long amount;

    @Override
    public Long getFee() {
        return getAmount() * 10 / 100;
    }

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.GOPAY;
    }
}
