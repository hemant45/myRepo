package com.practice.designpattern.factory;

public class Swift implements Cars{

    @Override
    public void createCar(){
        System.out.println("Swift Purchased");
    }
}
