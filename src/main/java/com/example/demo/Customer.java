package com.example.demo;

public class Customer {

    private Integer id;
    private String name;
    private String ssn;

    public Customer() {}

    public Customer(Integer id, String name, String ssn) {
        this.id = id;
        this.name = name;
        this.ssn = ssn;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Integer getId() {
        return id;
    }

    public String getSsn() {
        return ssn;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer { " + " ID = " + id + " NAME = " + name + " SSN = " + ssn + " }";
    }

}
