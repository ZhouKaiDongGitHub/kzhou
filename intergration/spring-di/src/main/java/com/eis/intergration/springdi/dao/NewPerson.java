package com.eis.intergration.springdi.dao;

import java.util.List;

public class NewPerson {
    private String name;
    private int age;
    private List<Car> cars;

    public NewPerson() {
    }
    public NewPerson(String name, int age, List<Car> cars) {
        super();
        this.name = name;
        this.age = age;
        this.cars = cars;
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


    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", cars=" + cars + "]";
    }
}
