package com.belajar.design.pattern.abstract_fctory.bca_klikpay;

import com.belajar.design.pattern.abstract_fctory.CancelPaymentRequest;
import com.belajar.design.pattern.abstract_fctory.PaymentMethod;
import lombok.Data;

@Data
public class BcaKlikpayCancel implements CancelPaymentRequest {

    private String id;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.BCA_KLIKPAY;
    }
}
