package com.practice.multiThreading;


/**
 * This class gives different value of count at every run because this is not synchronised
 */
public class WithoutSyncDemo {
    int count=0;
    public static void main(String [] args){
        WithoutSyncDemo wsd = new WithoutSyncDemo();
        wsd.doWork();
    }

    public void doWork(){

        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i < 100000 ; i++){
                    count ++;
                }
            }
        });

        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i < 100000 ; i++){
                    count ++;
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
