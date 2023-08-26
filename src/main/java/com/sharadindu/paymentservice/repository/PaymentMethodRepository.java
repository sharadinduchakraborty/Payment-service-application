package com.sharadindu.paymentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sharadindu.paymentservice.entity.PaymentMethod;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Integer> {

	

}
