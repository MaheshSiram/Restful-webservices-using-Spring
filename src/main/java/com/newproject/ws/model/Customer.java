package com.newproject.ws.model;

/**
 * Created by mahesh on 12/12/2017.
 */
public class Customer {

      private long id;
      private long UserID;
      private String Name;

     private String Company;

    public Customer() {

    }

    public Customer(long id, String name, String company, long userID) {
        this.id = id;
        Name = name;
        Company = company;
        UserID = userID;
    }

    public long getUserID() {
        return UserID;
    }

    public void setUserID(long userID) {
        UserID = userID;
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

