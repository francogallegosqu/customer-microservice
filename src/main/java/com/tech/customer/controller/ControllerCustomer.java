package com.tech.customer.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.customer.entity.Customer;
import com.tech.customer.exception.NoBodyException;
import com.tech.customer.exception.ServerException;
import com.tech.customer.service.IServiceCustomer;

@RestController
@RequestMapping("/api/user")
public class ControllerCustomer {
	@Autowired
	private IServiceCustomer serviceCustomer;
	
	
	@PostMapping("/create")
	public ResponseEntity<Customer> save(@RequestBody @Valid Customer customer){
		try {
			if(customer == null) throw new NoBodyException("There'not body");
			Customer newCustomer = this.serviceCustomer.insert(customer);
			return new ResponseEntity<Customer>(newCustomer, HttpStatus.OK);
		}catch(Exception e) {
			throw new ServerException(e.getMessage());
		}
	}

}
