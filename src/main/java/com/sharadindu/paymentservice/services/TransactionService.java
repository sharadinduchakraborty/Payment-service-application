package com.sharadindu.paymentservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharadindu.paymentservice.entity.Transaction;
import com.sharadindu.paymentservice.repository.TransactionRepository;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction createTransaction(Transaction newTransaction) {
        // You might want to add additional validation or business logic here before saving the transaction.
        return transactionRepository.save(newTransaction);
    }

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }
    
    // Add more methods as needed, like getTransactionById, updateTransaction, deleteTransaction, etc.
}
