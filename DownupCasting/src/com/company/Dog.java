package com.company;

public class Dog extends  Animal{
    String Source;
    void sound(){
        System.out.println("gau gau");
    }

    public Dog(String name, int age, String source) {
        super(name, age);
        Source = source;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Source='" + Source + '\'' +
                '}';
    }
}
