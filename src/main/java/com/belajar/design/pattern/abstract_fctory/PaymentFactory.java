package com.belajar.design.pattern.abstract_fctory;

public interface PaymentFactory {
    ChargePaymentRequest createChargeRequest();

    CancelPaymentRequest createCancelRequest();

    GetBalancePaymentRequest createGetBalanceRequest();
}
