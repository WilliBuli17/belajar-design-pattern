package com.belajar.design.pattern.abstract_fctory;

public interface GetBalancePaymentRequest {
    String getUserId();

    void setUserId(String userId);

    PaymentMethod getMethod();
}
