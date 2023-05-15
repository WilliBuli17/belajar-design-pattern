package com.belajar.design.pattern.abstract_fctory.payment_factory;

import com.belajar.design.pattern.abstract_fctory.CancelPaymentRequest;
import com.belajar.design.pattern.abstract_fctory.ChargePaymentRequest;
import com.belajar.design.pattern.abstract_fctory.GetBalancePaymentRequest;
import com.belajar.design.pattern.abstract_fctory.PaymentFactory;
import com.belajar.design.pattern.abstract_fctory.bca_klikpay.BcaKlikpayCancel;
import com.belajar.design.pattern.abstract_fctory.bca_klikpay.BcaKlikpayCharge;
import com.belajar.design.pattern.abstract_fctory.bca_klikpay.BcaKlikpayGetBalance;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BcaKlikpayPaymentFactory implements PaymentFactory {
    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new BcaKlikpayCharge();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new BcaKlikpayCancel();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new BcaKlikpayGetBalance();
    }
}
