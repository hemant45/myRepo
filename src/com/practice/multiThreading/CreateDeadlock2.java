package com.practice.multiThreading;

class DeadDemo extends Thread{
    String str1= "String 1";
     String str2= "String 2";

     public synchronized void display(){
         while(true){
             System.out.println(str1 + str2);
         }
     }

    public void run(){

    }
}

public class CreateDeadlock2 {
    public static void main(String [] args){

    }
}
