package com.github.murilonerdx.paymentservice.service;

import com.github.murilonerdx.paymentservice.model.Payment;

public interface PaymentService {
    void sendPayment(Payment payment);
}
