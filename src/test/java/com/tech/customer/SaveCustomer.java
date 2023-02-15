package com.tech.customer;

import java.util.Date;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.tech.customer.entity.Customer;
import com.tech.customer.repository.IRepositoryCustomer;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class SaveCustomer {

	@Autowired
	private IRepositoryCustomer repositoryCustomer;
	
	@Test
	public void saveCustomer() {
		Date born = new Date();
		Integer age = 26;
		Customer customer = new Customer("Franco","Gallegos",age,born);
		Customer newCustomer = this.repositoryCustomer.save(customer);
		Assertions.assertThat(customer.getName()).isEqualTo(newCustomer.getName());
		
	}
}
