package com.belajar.design.pattern.abstract_fctory.bca_klikpay;

import com.belajar.design.pattern.abstract_fctory.ChargePaymentRequest;
import com.belajar.design.pattern.abstract_fctory.PaymentMethod;
import lombok.Data;

@Data
public class BcaKlikpayCharge implements ChargePaymentRequest {

    private String id;
    private Long amount;

    @Override
    public Long getFee() {
        return getAmount() * 7 / 100;
    }

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.BCA_KLIKPAY;
    }
}
