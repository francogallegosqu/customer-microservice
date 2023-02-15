package com.tech.customer.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity(name = "customer")
public class Customer {
	
	
	public Customer() {
	}

	public Customer(String name2, String lastName2, Integer age2, Date born2) {
		this.name = name2;
		this.lastName = lastName2;
		this.age = age2;
		this.born = born2;
	}




	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message = "Name must be especified")
	@NotNull
	private String name;
	@Column(name = "last_name")
	@NotBlank(message = "Last Name must be especified")
	private String lastName;
	@NotNull(message = "Age must be especified")
	private Integer age;
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date born;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBorn() {
		return born;
	}

	public void setBorn(Date born) {
		this.born = born;
	}

}
