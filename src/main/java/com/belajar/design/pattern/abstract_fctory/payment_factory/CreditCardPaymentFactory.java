package com.belajar.design.pattern.abstract_fctory.payment_factory;

import com.belajar.design.pattern.abstract_fctory.CancelPaymentRequest;
import com.belajar.design.pattern.abstract_fctory.ChargePaymentRequest;
import com.belajar.design.pattern.abstract_fctory.GetBalancePaymentRequest;
import com.belajar.design.pattern.abstract_fctory.PaymentFactory;
import com.belajar.design.pattern.abstract_fctory.credit_card.CreditCardCancel;
import com.belajar.design.pattern.abstract_fctory.credit_card.CreditCardCharge;
import com.belajar.design.pattern.abstract_fctory.credit_card.CreditCardGetBalance;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreditCardPaymentFactory implements PaymentFactory {
    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new CreditCardCharge();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new CreditCardCancel();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new CreditCardGetBalance();
    }
}
