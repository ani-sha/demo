package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class CustomerDAOImpl implements CustomerDAO {

    JdbcTemplate jdbcTemplate;

    private final String SQL_FIND_CUSTOMER = "SELECT * FROM CUSTOMER WHERE ID = ?";
    private final String SQL_DELETE_CUSTOMER = "DELETE FROM CUSTOMER WHERE ID = ?";
    private final String SQL_UPDATE_CUSTOMER = "UPDATE CUSTOMER SET NAME = ?, SSN  = ? WHERE ID = ?";
    private final String SQL_GET_ALL = "SELECT * FROM CUSTOMER";
    private final String SQL_INSERT_CUSTOMER = "INSERT INTO CUSTOMER(ID, SSN, NAME) values(?,?,?)";

    @Autowired
    public CustomerDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public CustomerDAOImpl() {

    }

    @Override
    public List<Customer> listCustomer() {
        return jdbcTemplate.query(SQL_GET_ALL,new CustomerMapper());
    }

    @Override
    public void setDataSource(DataSources ds) {
    }

    @Override
    public boolean createCustomer(Customer customer) {
        return jdbcTemplate.update(SQL_INSERT_CUSTOMER,customer.getId(),customer.getSsn(),customer.getName()) > 0;
    }
    @Override
    public boolean deleteCustomer(Customer customer) {
        return jdbcTemplate.update(SQL_DELETE_CUSTOMER, customer.getId()) > 0;
    }
    @Override
    public boolean updateCustomer(Customer customer) {
        return jdbcTemplate.update(SQL_UPDATE_CUSTOMER, customer.getName(), customer.getSsn(), customer.getId()) > 0;
    }

    @Override
    public Customer getCustomerById(Long id) {
        return jdbcTemplate.queryForObject(SQL_FIND_CUSTOMER, new Object[ ]{id}, new CustomerMapper());
    }
}
