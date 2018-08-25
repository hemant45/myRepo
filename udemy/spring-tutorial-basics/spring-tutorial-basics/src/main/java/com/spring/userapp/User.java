package com.spring.userapp;

import java.util.Date;

public class User {
    public User(Integer id, String name, Date doj) {
        this.id = id;
        this.name = name;
        this.doj = doj;
    }

    public User(){
    }

    private Integer id;
    private String name;
    private Date doj;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", doj=" + doj +
                '}';
    }
}
