package com.practice.multiThreading;




class DeadlockDemo extends Thread {
    public synchronized void  printText(){
        System.out.println("entered print text" + Thread.currentThread().getName());
        DeadlockDemo th2= new DeadlockDemo();
        th2.run();
        System.out.println("Exiting print text" );
    }

    @Override
    public void run(){
        printText();
    }
}
public class CreateDeadlock {
    public static void main(String [] args){
        DeadlockDemo th1= new DeadlockDemo();
        th1.run();
    }
}
