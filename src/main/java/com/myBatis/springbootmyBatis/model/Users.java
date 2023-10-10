package com.myBatis.springbootmyBatis.model;

public class Users {
    public String name;
    public Integer salary;
    public Integer id;

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
