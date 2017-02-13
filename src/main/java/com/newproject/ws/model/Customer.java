package com.newproject.ws.model;

/**
 * Created by mahesh on 12/12/2017.
 */
public class Customer {

     private long id;
     private String Name;
     private String Company;

    public Customer() {

    }

    public Customer(long id, String name, String company) {
        this.id = id;
        Name = name;
        Company = company;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setId(long id) {
        this.id = id;
    }
}

