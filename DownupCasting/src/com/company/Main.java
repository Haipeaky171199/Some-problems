package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Main {

    static List<Animal> animals = new ArrayList<>();
    public static void main(String[] args) {

        Main  main = new Main();
        Cat cat = new Cat("Mun", 2, "Meo anh");
        Dog dog = new Dog("Den", 2,"Bec gie");

        Animal animal2 = cat; // Upcasting khong tuong minh
        Animal animal3 = (Animal) cat;// upcasting tuong minh
        animal2.eat(); // chỉ truy cập được method trong class cha
        animal3.eat(); // chỉ truy cập được method trong class cha


        animals.add(cat);
        animals.add(dog);
        animals.get(0).eat(); // get để lấy giá trị đầu tiên trong mảng
        for(Animal s: animals){
            System.out.println(s);
        }



//
        Animal animal = new Cat("Mun", 2, "Meo anh");
        Animal animal1 = new Dog("Den", 2, "becgie");
        Cat cat1 = (Cat) animal; // downcasting
        Dog dog1 = (Dog) animal1;
        cat1.eat(); // truy cập được method trong class con và method trong class cha mà con đã kế thừa
        cat1.sound();
        dog1.eat();
        dog.sound();




	// write your code here
//        Animal animal = new Cat();
//      Animal cat = new Cat();
//      //  Cat cat = new Animal();
//
//        Animal animal2 = (Animal) cat;
      //  List<Animal> animals =  new ArrayList<>();


    }
}
