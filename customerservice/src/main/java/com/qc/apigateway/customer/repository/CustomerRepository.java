package com.qc.apigateway.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qc.apigateway.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {}