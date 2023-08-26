package com.sharadindu.paymentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sharadindu.paymentservice.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}
