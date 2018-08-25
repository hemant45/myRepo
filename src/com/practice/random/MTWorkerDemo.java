package com.practice.random;

public class MTWorkerDemo {


 public static void main(String [] args){
     int [] arr = {1,1,1,1,2,32,43,43,45,45,45,45,43,43,43,43,43,43,32,65,45,43,65,45,32,45,23};
     MultiThreadWorker  multi = new MultiThreadWorker(arr);
 }

}
