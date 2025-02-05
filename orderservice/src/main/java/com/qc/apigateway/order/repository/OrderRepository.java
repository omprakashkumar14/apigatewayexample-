package com.qc.apigateway.order.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.qc.apigateway.order.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Integer> {}