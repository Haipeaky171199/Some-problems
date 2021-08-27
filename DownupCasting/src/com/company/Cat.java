package com.company;

public class Cat extends Animal{

    String Type;

    void sound(){
        System.out.println("meo meo");
    }

    public Cat(String name, int age, String type) {
        super(name, age);
        Type = type;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Type='" + Type + '\'' +
                '}';
    }
}
