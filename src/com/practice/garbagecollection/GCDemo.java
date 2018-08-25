package com.practice.garbagecollection;

public class GCDemo {

    public static void main(String [] args){
        GCDemo gc = new GCDemo();
        String str = "Hello There";
        gc = null;
        //System.gc();
        str = null;// This will not call finalize overriden as this is Strign class object
        Runtime.getRuntime().gc();

    }

    public void finalize(){
        System.out.println("Finalise called for : " + this.getClass());
        System.out.print(10/0);// Exceptions are ignored in Finalize method
    }
}
