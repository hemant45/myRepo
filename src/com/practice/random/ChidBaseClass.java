package com.practice.random;
class BaseClass{
    protected int i =10;
    BaseClass(){
        System.out.println("Base Class constructor called");
    }
    void display(){
        System.out.println("Base Class Display called");
    }
}
class ChildClass extends BaseClass{
    protected int i=20;
    ChildClass(){
        System.out.println("Child Class constructor called");
    }
    void display(){
        System.out.println("Child Class Display called");
    }
}
public class ChidBaseClass {

    public static void main(String [] args){
        BaseClass b = new ChildClass();
        b.display();
        //b.displayChild(); This gives compile time error
        System.out.println("************************");
        ChildClass bc = new ChildClass();
        bc.display();
        System.out.println("B's I : "+ b.i);
        System.out.println("BC's I : "+ bc.i);
        System.out.println(bc.getClass());
        System.out.print(b.getClass());
    }
}
