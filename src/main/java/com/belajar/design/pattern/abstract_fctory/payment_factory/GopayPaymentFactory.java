package com.belajar.design.pattern.abstract_fctory.payment_factory;

import com.belajar.design.pattern.abstract_fctory.CancelPaymentRequest;
import com.belajar.design.pattern.abstract_fctory.ChargePaymentRequest;
import com.belajar.design.pattern.abstract_fctory.GetBalancePaymentRequest;
import com.belajar.design.pattern.abstract_fctory.PaymentFactory;
import com.belajar.design.pattern.abstract_fctory.gopay.GopayCancel;
import com.belajar.design.pattern.abstract_fctory.gopay.GopayCharge;
import com.belajar.design.pattern.abstract_fctory.gopay.GopayGetBalance;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GopayPaymentFactory implements PaymentFactory {
    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new GopayCharge();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new GopayCancel();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new GopayGetBalance();
    }
}
