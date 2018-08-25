package com.practice.random;

 class Base extends Throwable {}
 class Derived extends Throwable {}

public class ExceptionHandlingInheritance
{
    public static void main(String [] args){
        try{
            throw new Base();
        }
        /*catch (Derived d){ //This will give a compile time exception as the corresponding is never thrown in the try block
            System.out.println("Derived Exception");
        }*/
        catch (Base b){
        System.out.println("BAse Exception");
        }

    }
}
