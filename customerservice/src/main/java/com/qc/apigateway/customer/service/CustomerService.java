package com.qc.apigateway.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qc.apigateway.customer.entity.Customer;
import com.qc.apigateway.customer.repository.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
//...........................
    public Optional<Customer> getCustomerById(Long id) {
		return customerRepository.findById(id);
	}

	public Customer saveCustomerDetails(Customer customer) {

		return customerRepository.save(customer);

   
	}
}