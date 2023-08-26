package com.sharadindu.paymentservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharadindu.paymentservice.entity.User;
import com.sharadindu.paymentservice.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User newUser) {
        // Check if the username is already taken
        if (userRepository.findByUsername(newUser.getUsername()) != null) {
            throw new IllegalArgumentException("Username already taken");
        }

        // You should hash the password before saving it to the database for security reasons.
        // In a real application, use libraries like BCryptPasswordEncoder to hash the password.
        // For this example, we'll assume newUser.getPassword() returns the hashed password.

        newUser.setPassword(newUser.getPassword()); // Store hashed password in the database
        return userRepository.save(newUser);
    }
    
    // Add more methods as needed, like getUserById, updateUser, deleteUser, etc.
}
