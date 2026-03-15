package com.example;

import java.time.LocalDate;

public class Employee {

    private String name;
    private String mother;
    private String city;
    private String address;
    private LocalDate birth;
    private Integer salary;
    private Integer bonus;

    public Employee(String name, String mother, String city, String address,
                    LocalDate birth, Integer salary, Integer bonus) {
        this.name = name;
        this.mother = mother;
        this.city = city;
        this.address = address;
        this.birth = birth;
        this.salary = salary;
        this.bonus = bonus;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public String getMother() {
        return mother;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }
}