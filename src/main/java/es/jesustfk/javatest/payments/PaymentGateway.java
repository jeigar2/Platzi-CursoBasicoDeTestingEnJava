package es.jesustfk.javatest.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);
}
