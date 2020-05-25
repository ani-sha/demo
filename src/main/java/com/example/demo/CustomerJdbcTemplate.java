package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class CustomerJdbcTemplate implements CustomerDAO {

    @Autowired
    private static DataSources dataSources;
    private static JdbcTemplate jdbcTemplate;

    public Customer getCustomer(Integer id) {
        return null;
    }

    public void create(Integer id, String ssn, String name) {
        System.out.println("Created Record Name = " + id + " " + ssn + " " + name);
        String sql = "INSERT INTO CUSTOMER (ID,SSN,NAME) VALUES(?, ?, ?)";
        jdbcTemplate.update(sql,id,ssn,name);
        System.out.println("Created Record Name = " + id + " " + ssn + " " + name);
        return;
    }

    public List<Customer> listCustomer() {
        String sql = "SELECT * FROM CUSTOMER";
        CustomerMapper customerMapper = new CustomerMapper();
        System.out.println(customerMapper);
        List<Customer> customers = jdbcTemplate.query(sql, customerMapper);
        return customers;
    }

    public void setDataSource(DataSources dataSources) {
        this.dataSources = dataSources;
        this.jdbcTemplate = new JdbcTemplate((DataSource) dataSources);
    }

}

