package com.belajar.design.pattern.abstract_fctory.bca_klikpay;

import com.belajar.design.pattern.abstract_fctory.GetBalancePaymentRequest;
import com.belajar.design.pattern.abstract_fctory.PaymentMethod;
import lombok.Data;

@Data
public class BcaKlikpayGetBalance implements GetBalancePaymentRequest {

    private String userId;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.BCA_KLIKPAY;
    }
}
