package com.sharadindu.paymentservice.controller;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping("/create")
    public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction newTransaction) {
        Transaction createdTransaction = transactionService.createTransaction(newTransaction);
        return ResponseEntity.ok(createdTransaction);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Transaction>> getAllTransactions() {
        List<Transaction> transactions = transactionService.getAllTransactions();
        return ResponseEntity.ok(transactions);
    }

    // Add more endpoints for transaction-related operations as needed
}
