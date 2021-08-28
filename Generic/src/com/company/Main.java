package com.company;

import java.util.ArrayList;
import java.util.List;

abstract class Student{
    abstract  void name();
}
class Lop_Toan extends Student{

    @Override
    void name() {
        System.out.println("hau het la ten con trai");
    }
}
class Lop_Van extends Student{

    @Override
    void name() {
        System.out.println("hau het la ten con gai");
    }
}
//class MyGeneric<T> {
//    T obj;
//
//    void add(T obj) {
//        this.obj = obj;
//    }
//
//    public T getObj() {
//        return obj;
//    }
//
//    public void setObj(T obj) {
//        this.obj = obj;
//    }
//
//
//    // method generic
//
//
//}

public class Main {
    public static void nameStudent(List<? extends Student> list){
        for(Student s: list){
            s.name();
        }
    }

    //--------------------------------//
//    public  <E> void display(E[] elements){
//        for(E element: elements){
//            System.out.println(element + " ");
//        }
//
//    }

    public static void main(String[] args) {
//class
//        //use String
//        MyGeneric<String> myGeneric1 = new MyGeneric<>();
//        myGeneric1.add("Phan");
//        myGeneric1.add("Hai");
//        System.out.println(myGeneric1.getObj());
//        // use Integer
//        MyGeneric<Integer> myGeneric2 = new MyGeneric<>();
//        myGeneric2.add(2);
//
        //method
//        Main main = new Main();
//        Integer[] Arr = {1,2,3,4,5};
//        Character Arr1[] = {'P', 'H', 'A', 'N'};
//
//        System.out.print("So nguyen: ");
//        main.display(Arr);
//        System.out.print("Mang ky tu: ");
//        main.display(Arr1);


//
//        List<Lop_Toan> list1 = new ArrayList<>();
//        list1.add(new Lop_Toan());
//
//        List<Lop_Van> list2 = new ArrayList<>();
//        list2.add(new Lop_Van());
//
//        nameStudent(list1);
//        nameStudent(list2);

    }
}