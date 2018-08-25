package com.practice.random;

class TestException extends Throwable{
 //String e="Something wrong happenend";
}
public class ExceptionHandling {
    public static void main(String args[]) {
        try {
            throw new TestException();
        }
        catch(TestException t) {
            System.out.println("Got the Test Exception");
        }
        finally {
            System.out.println("Inside finally block ");
        }
    }
}
