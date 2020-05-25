package com.example.demo;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerMapper implements RowMapper<Customer> {

    public Customer mapRow(ResultSet resultSet, int rowNum) throws SQLException{
        Customer userFunctions = new Customer();
            userFunctions.setId(resultSet.getInt("ID"));
            userFunctions.setSsn(resultSet.getString("SSN"));
            userFunctions.setName(resultSet.getString("NAME"));
        return userFunctions;
    }
}
