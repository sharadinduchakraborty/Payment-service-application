package com.sharadindu.paymentservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharadindu.paymentservice.entity.PaymentMethod;
import com.sharadindu.paymentservice.repository.PaymentMethodRepository;

@Service
public class PaymentMethodService {
    @Autowired
    private PaymentMethodRepository paymentMethodRepository;

    public PaymentMethod addPaymentMethod(PaymentMethod newPaymentMethod) {
        // You might want to add validation or business logic here before saving the payment method.
        return paymentMethodRepository.save(newPaymentMethod);
    }

    public List<PaymentMethod> getAllPaymentMethods() {
        return paymentMethodRepository.findAll();
    }
    
    // Add more methods as needed, like getPaymentMethodById, updatePaymentMethod, deletePaymentMethod, etc.
}




