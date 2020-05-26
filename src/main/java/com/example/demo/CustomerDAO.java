package com.example.demo;

import java.util.List;

public interface CustomerDAO {

    List<Customer> listCustomer();

    void setDataSource(DataSources ds);

    boolean createCustomer(Customer customer);

    boolean deleteCustomer(Customer customer);

    boolean updateCustomer(Customer customer);

    Customer getCustomerById(Long id);

}
