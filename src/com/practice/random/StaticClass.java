package com.practice.random;

public class StaticClass {


    public static void main(String [] args){
        StaticClassTest sct = new StaticClassTest();
        System.out.print("");
    }

}
class StaticClassTest {
    int k = 50;
    public class InnerClass {
        int i =10;
        int j =20;
    }

}
