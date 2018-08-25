package com.practice.designpattern.singleton;

public class SingleTonImpl1 {

    public static void main (String [] args){
        SingleTon inst = SingleTon.getInstance();

        inst.setVal(80);

        System.out.print("Value in first instance : "+ inst.getVal());

        SingleTon inst1=SingleTon.getInstance();
        inst1.setVal(100);

        System.out.print("Value in first instance : "+ inst.getVal());
    }
}
