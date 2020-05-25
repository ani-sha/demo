package com.example.demo;

public class Customer {

    private Integer id;
    private String name;
    private String ssn;

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

}
