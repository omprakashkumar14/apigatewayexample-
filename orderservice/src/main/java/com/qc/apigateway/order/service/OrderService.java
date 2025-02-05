package com.qc.apigateway.order.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qc.apigateway.order.entity.Orders;
import com.qc.apigateway.order.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;

	public List<Orders> getAllOrders() {
		return orderRepository.findAll();
	}

	public Optional<Orders> getOrderById(Integer id) {
		return orderRepository.findById(id);
	}

	public Orders saveOrderDetails(Orders order) {

		return orderRepository.save(order);

	}

}