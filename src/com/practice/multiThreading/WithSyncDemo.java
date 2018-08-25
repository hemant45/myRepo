package com.practice.multiThreading;

/**
 * This class has synchronised method which ensures that at a given time only one thread will acess the variable
 */
public class WithSyncDemo {
    int count=0;

    public synchronized void increment(){
        count++;
    }
    public static void  main(String [] args){
        WithSyncDemo wsd = new WithSyncDemo();
        wsd.doWork();
    }

    public void doWork(){

        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i < 1000 ; i++){
                    increment();
                }
            }
        });

        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i < 1000 ; i++){
                    increment();
                }
            }
        });
        th1.start();
        th2.start();

        try {
            th2.join();
            th1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("value of count is : " + count);

    }

}
