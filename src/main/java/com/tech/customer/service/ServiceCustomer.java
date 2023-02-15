package com.tech.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.customer.entity.Customer;
import com.tech.customer.repository.IRepositoryCustomer;

@Service
public class ServiceCustomer implements IServiceCustomer {
	@Autowired
	private IRepositoryCustomer repositoryCustomer;
	@Override
	public Customer insert(Customer customer) {
		Customer newCustomer = this.repositoryCustomer.save(customer);
		return newCustomer;
	}
}
