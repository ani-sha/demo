package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		CustomerDAO customerDAO = context.getBean(CustomerDAO.class);

		for( Customer c : customerDAO.listCustomer()) {
			System.out.println(c);
		}

		System.out.println("Creating New Customer : ");
		Customer customer = new Customer(13, "Augustus Mir", "CST1005");
		System.out.println(customer);
		customerDAO.createCustomer(customer);

		Customer c1 = customerDAO.getCustomerById((long)11);
		c1.setName("Hanna Jones");

		System.out.println("Updating existing Customer : ");
		customerDAO.updateCustomer(c1);

		for( Customer c : customerDAO.listCustomer()) {
			System.out.println(c);
		}
	}

//
//	@Override
//	public void run(String... args) throws Exception {
//		String SQL_GET_ALL = "SELECT * FROM CUSTOMER";
//
//		jdbcTemplate
//				.query(SQL_GET_ALL, new CustomerMapper())
//				.forEach(s-> System.out.println(s.getId() +" " + s.getName() + " " + s.getSsn()));
//
//		jdbcTemplate
//				.query("SELECT * FROM CUSTOMER WHERE ID=10", new CustomerMapper())
//				.forEach(s-> System.out.println(s.getId() +" " + s.getName() + " " + s.getSsn()));
//    }
}

