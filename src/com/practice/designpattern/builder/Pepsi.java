package com.practice.designpattern.builder;

public class Pepsi extends Drink{
    @Override
    public Integer cost(){
        return 20;
    }

    @Override
    public String name(){
        return "Pepsi";
    }
}
