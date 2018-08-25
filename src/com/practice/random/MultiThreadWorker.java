package com.practice.random;

import java.lang.Thread;


public class MultiThreadWorker extends Thread{

    int [] arr;

    MultiThreadWorker (){
        System.out.println("Default construcotr");
    }
   MultiThreadWorker(int [] arr){
        super();
        this.arr=arr;
        System.out.println("Worker Constructor called");
        start();
    }

    @Override
    public void run(){
        //Thread.currentThread().getName();
        for(int i= 0; i < arr.length; i ++){
            System.out.println("Thread : "+ Thread.currentThread().getName() +" \nArray element : "+ arr[i]);
        }
    }
}
