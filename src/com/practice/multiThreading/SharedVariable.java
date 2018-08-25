package com.practice.multiThreading;

class ThreadDemo extends Thread{
     static volatile int i =10;
    @Override
    public void run(){
        while (i < 50 ){

            System.out.println(this.getName() + "Valse of i " + i);
            i++;


        }
    }
}

public class SharedVariable {

    public static void main(String [] args){

        ThreadDemo th1= new ThreadDemo();
        ThreadDemo th2 = new ThreadDemo();

        th1.start();
        th2.start();
    }

}
