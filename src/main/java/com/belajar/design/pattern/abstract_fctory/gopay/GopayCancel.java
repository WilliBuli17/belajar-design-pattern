package com.belajar.design.pattern.abstract_fctory.gopay;

import com.belajar.design.pattern.abstract_fctory.CancelPaymentRequest;
import com.belajar.design.pattern.abstract_fctory.PaymentMethod;
import lombok.Data;

@Data
public class GopayCancel implements CancelPaymentRequest {

    private String id;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.GOPAY;
    }
}
