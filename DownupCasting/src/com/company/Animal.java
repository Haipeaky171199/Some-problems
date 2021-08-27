package com.company;

public class Animal {
    String name;
    int age;
    public void eat(){
        System.out.println("Eating");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
