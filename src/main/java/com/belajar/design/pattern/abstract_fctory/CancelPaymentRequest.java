package com.belajar.design.pattern.abstract_fctory;

public interface CancelPaymentRequest {
    String getId();

    void setId(String id);

    PaymentMethod getMethod();
}
