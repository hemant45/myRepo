package com.practice.random;



public class WrapperClassImmutable {


    public static void main (String [] args){
        Integer I =11;
        int i = 11;
        modify(I,i);
        System.out.print("Integer " + I + "\nint " + i);
    }

    public static void modify(Integer I, int i){
        I=I+1;
        i=i+1;
    }
}
