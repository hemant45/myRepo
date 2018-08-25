package com.practice.multiThreading;


class JoinerDemo extends Thread {
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
public class MultiThreadingJoin {

    public static void main(String [] args){
        JoinerDemo th1 = new JoinerDemo();
        JoinerDemo th2 = new JoinerDemo();
        JoinerDemo th3 = new JoinerDemo();


        try{
            th1.start();
            th2.start();
            th3.start();
            th1.join();

        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

}
