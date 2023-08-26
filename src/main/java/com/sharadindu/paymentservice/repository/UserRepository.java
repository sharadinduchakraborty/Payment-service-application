package com.sharadindu.paymentservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sharadindu.paymentservice.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUsername(String username);

}
