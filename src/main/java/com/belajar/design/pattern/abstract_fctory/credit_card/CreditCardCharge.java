package com.belajar.design.pattern.abstract_fctory.credit_card;

import com.belajar.design.pattern.abstract_fctory.ChargePaymentRequest;
import com.belajar.design.pattern.abstract_fctory.PaymentMethod;
import lombok.Data;

@Data
public class CreditCardCharge implements ChargePaymentRequest {

    private String id;
    private Long amount;

    @Override
    public Long getFee() {
        return getAmount() * 5 / 100;
    }

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.CREDIT_CARD;
    }
}
