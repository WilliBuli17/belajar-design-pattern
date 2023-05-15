package com.belajar.design.pattern.abstract_fctory.gopay;

import com.belajar.design.pattern.abstract_fctory.GetBalancePaymentRequest;
import com.belajar.design.pattern.abstract_fctory.PaymentMethod;
import lombok.Data;

@Data
public class GopayGetBalance implements GetBalancePaymentRequest {

    private String userId;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.GOPAY;
    }
}
