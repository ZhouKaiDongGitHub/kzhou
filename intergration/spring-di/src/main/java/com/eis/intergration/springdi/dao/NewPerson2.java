package com.eis.intergration.springdi.dao;

import java.util.Map;

public class NewPerson2 {
    private String name;
    private int age;
    private Map<String, Car> cars;
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
    public Map<String, Car> getCars() {
        return cars;
    }
    public void setCars(Map<String, Car> cars) {
        this.cars = cars;
    }

    public NewPerson2() {
        // TODO Auto-generated constructor stub
    }
    public NewPerson2(String name, int age, Map<String, Car> cars) {
        super();
        this.name = name;
        this.age = age;
        this.cars = cars;
    }
    @Override
    public String toString() {
        return "NewPerson [name=" + name + ", age=" + age + ", cars=" + cars + "]";
    }
}
