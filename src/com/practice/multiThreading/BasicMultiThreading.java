package com.practice.multiThreading;

class Runner extends Thread{

    @Override
    public void run(){
        for (int i =0; i < 10 ; i++){
            System.out.println(" Running thread " + i);

            try{
                Thread.sleep(20);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }

        }
    }
}

class Runnerable implements Runnable{

    @Override
    public void run(){
        for (int i =0; i < 10 ; i++){
            System.out.println(" Running Runnerable " + i);

            try{
                Thread.sleep(20);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }

        }
    }
}

public class BasicMultiThreading {
    public static void main(String [] args){
        Runner run1 = new Runner();
        Runner run2 = new Runner();
        //run1.run(); // Run method when called directly executes in the main thread and acts as any other mehod
        run1.start();
        run2.start();
        new Runner().start();
        new Runner().start();
        new Runner().start();
        new Runner().start();
        new Runner().start();

        System.out.println("Using Runnable");
        Runnerable r1= new Runnerable();
        Thread th1= new Thread(r1);
        Thread th2 = new Thread(r1);
        Thread th3 = new Thread(r1);
        th1.start();
        th2.start();
        th3.start();
    }
}

