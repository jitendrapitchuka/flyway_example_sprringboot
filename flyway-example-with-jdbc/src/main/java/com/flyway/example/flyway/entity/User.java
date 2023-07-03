package com.flyway.example.flyway.entity;

import javax.persistence.*;

@Entity
@Table(name="flyway_test")
public class User {
    @Id
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;

    @Column(name="phone_no")
    private Long phoneNo;

    public User(int id, String name, int age, Long phoneNo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
    }

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public User(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
