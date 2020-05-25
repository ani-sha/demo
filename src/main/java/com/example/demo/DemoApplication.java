package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class DemoApplication  {

	public static void main(String[] args) throws NullPointerException {
		SpringApplication.run(DemoApplication.class, args);

		CustomerJdbcTemplate customerJdbcTemplate = new CustomerJdbcTemplate();

		customerJdbcTemplate.create(100, "CST01009", "Joseph");

		List<Customer> customerList = customerJdbcTemplate.listCustomer();
		for(Customer uf : customerList) {
			System.out.print("ID : " + uf.getId());
			System.out.print("SSN : " + uf.getSsn());
			System.out.print("NAME : " + uf.getName());
		}

	}
}

