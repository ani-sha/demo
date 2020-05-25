package com.example.demo;

import java.util.List;

public interface CustomerDAO {

    public Customer getCustomer(Integer id);

    public List<Customer> listCustomer();

    public void setDataSource(DataSources ds);

    public void create(Integer id, String ssn, String name);
}
