package com.practice.random;

class TestException1 extends Exception{
    String e="Something wrong happenend";
}
public class ExceptionHandling2 {

    public static void main (String [] args){
        System.out.println("In Test Class");
        try {
            TestException1 e = new TestException1();
            throw e;
        }
        /*catch(Exception e1){ Causes compiler error as this is the Base class to TestException1
            System.out.println("Exception occured");
        }*/
        catch (TestException1 e){
            System.out.println("Got the  Exception " + e.e);
        }
    }

}