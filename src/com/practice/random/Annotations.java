package com.practice.random;

class SuperClass{
    public void printFunct(){
        System.out.println("Super Class called");
    }
}

class SubClass extends SuperClass{
    @Override
    public void printFunct(){
        System.out.println("Sub Class called");
    }
}

public class Annotations {

    public static void main(String [] args){
        SubClass obj1= new SubClass();
        obj1.printFunct();
    }
}

