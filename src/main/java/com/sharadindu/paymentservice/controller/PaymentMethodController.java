package com.sharadindu.paymentservice.controller;

@RestController
@RequestMapping("/api/payment-methods")
public class PaymentMethodController {
    @Autowired
    private PaymentMethodService paymentMethodService;

    @PostMapping("/add")
    public ResponseEntity<PaymentMethod> addPaymentMethod(@RequestBody PaymentMethod newPaymentMethod) {
        PaymentMethod addedPaymentMethod = paymentMethodService.addPaymentMethod(newPaymentMethod);
        return ResponseEntity.ok(addedPaymentMethod);
    }

    @GetMapping("/all")
    public ResponseEntity<List<PaymentMethod>> getAllPaymentMethods() {
        List<PaymentMethod> paymentMethods = paymentMethodService.getAllPaymentMethods();
        return ResponseEntity.ok(paymentMethods);
    }

    // Add more endpoints for payment method-related operations as needed
}
