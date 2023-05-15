package com.belajar.design.pattern.abstract_fctory.credit_card;

import com.belajar.design.pattern.abstract_fctory.CancelPaymentRequest;
import com.belajar.design.pattern.abstract_fctory.PaymentMethod;
import lombok.Data;

@Data
public class CreditCardCancel implements CancelPaymentRequest {

    private String id;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.CREDIT_CARD;
    }
}
