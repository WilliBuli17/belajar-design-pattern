package com.belajar.design.pattern.abstract_fctory.credit_card;

import com.belajar.design.pattern.abstract_fctory.GetBalancePaymentRequest;
import com.belajar.design.pattern.abstract_fctory.PaymentMethod;
import lombok.Data;

@Data
public class CreditCardGetBalance implements GetBalancePaymentRequest {

    private String userId;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.CREDIT_CARD;
    }
}
