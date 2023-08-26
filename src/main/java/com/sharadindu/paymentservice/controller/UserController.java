package com.sharadindu.paymentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharadindu.paymentservice.services.UserService;
@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User newUser) {
        userService.registerUser(newUser);
        return ResponseEntity.ok("User registered successfully.");
    }

    // Add more endpoints for user-related operations as needed
}
