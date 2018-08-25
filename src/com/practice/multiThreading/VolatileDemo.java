package com.practice.multiThreading;

import java.util.Scanner;

class Processor extends Thread{
    public volatile boolean running = true; // If we remove volatile loop never ends
    @Override
    public void run(){
        while(running){
            System.out.println("Hello ");
            try{
                Thread.sleep(100);
            } catch(InterruptedException e){
                System.out.print(e.getMessage());
            }
        }

    }

    public void shutDown(){
        System.out.print("Called ShutDown");
        this.running = false;
    }
}

public class VolatileDemo  {
    public static void main(String [] args){
        Processor proc1 = new Processor();
        proc1.start();

        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        proc1.shutDown();


    }
}
