package com.practice.random;

public class NullTest {


    public static void main(String [] args){
        int ti= 0;
        Integer tt = null;
        if(ti == tt){
            System.out.println("PAss");
        }else{
            System.out.println("Null test happened");
            ti= tt;
        }
    }

}
