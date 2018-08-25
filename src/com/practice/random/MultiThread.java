package com.practice.random;

public class MultiThread extends Thread{
    public void run(){
        System.out.println("In run method");
    }

    public static void main(String [] args){
        Thread t = new Thread(new MultiThread() );
        System.out.println("Calling start");
        t.start();
        System.out.println("Ending program");
    }
}
