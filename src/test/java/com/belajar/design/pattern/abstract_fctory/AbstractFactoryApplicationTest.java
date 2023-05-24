package com.belajar.design.pattern.abstract_fctory;

import com.belajar.design.pattern.abstract_fctory.payment_factory.CreditCardPaymentFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = AbstractFactoryApplication.class)
class AbstractFactoryApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    public void charge(PaymentFactory paymentFactory) {
        ChargePaymentRequest request =  paymentFactory.createChargeRequest();
        request.setId("xxxx-payment-1");
        request.setAmount(100_000L);

        System.out.println(request);
    }

    public void cancle(PaymentFactory paymentFactory) {
        CancelPaymentRequest request =  paymentFactory.createCancelRequest();
        request.setId("xxxx-payment-2");

        System.out.println(request);
    }

    public Long getBalance(PaymentFactory paymentFactory) {
        GetBalancePaymentRequest request =  paymentFactory.createGetBalanceRequest();
        request.setUserId("xxxx-user-1");

        System.out.println(request);

        return 100_000_000L;
    }

    @Test
    void testPayment() {
        PaymentFactory paymentFactory = applicationContext.getBean(CreditCardPaymentFactory.class);
//        PaymentFactory paymentFactory = applicationContext.getBean(BcaKlikpayPaymentFactory.class);
//        PaymentFactory paymentFactory = applicationContext.getBean(GopayPaymentFactory.class);

        charge(paymentFactory);
        cancle(paymentFactory);
        getBalance(paymentFactory);
    }
}