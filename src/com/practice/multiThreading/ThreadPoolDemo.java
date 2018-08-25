package com.practice.multiThreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class  Application extends Thread{

    public void run(){
    }
}

public class ThreadPoolDemo {

    ExecutorService exec = Executors.newFixedThreadPool(5);

}
