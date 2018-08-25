package com.practice.random;
import java.lang.Runnable;

public class Test implements Runnable{
    public void run(){
            System.out.println(Thread.currentThread().getName());
            //Thread.currentThread().setPriority(5);
        //System.out.println("Parent : " +  this.getName());
        try{
            for(int i=1; i<=10 ; i++){
                Thread.sleep(10);
                System.out.println(Thread.currentThread().getName());
                System.out.println("Count  : "+ i);
            }

        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

    }
    public static void main(String [] args){
        Thread t1= new Thread(new Test());

        t1.setName("Thread1");
        t1.setPriority(1);
        Thread t2= new Thread(new Test());
        t2.setName("Thread2");
        Thread t3= new Thread(new Test());
        t3.setName("Thread3");
        t3.setPriority(10);
        t1.start();
        System.out.println("Call completed");
        t2.start();

        t3.start();
        try{
            t3.join();
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
