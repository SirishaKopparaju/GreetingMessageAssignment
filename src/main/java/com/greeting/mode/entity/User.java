package com.greeting.mode.entity;


import javax.persistence.Id;


public class User
{

    public String firstName;
    public String lastName;
    @Id
    private long id;

    public User() {
        this.firstName = "";
        this.lastName = "";
        this.id = 0;
    }

    public User(String firstName, String lastName, long id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        firstName = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}