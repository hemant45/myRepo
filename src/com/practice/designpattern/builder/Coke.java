package com.practice.designpattern.builder;

public class Coke extends Drink {
    @Override
    public Integer cost(){
        return 20;
    }

    @Override
    public String name(){
        return "Coke";
    }
}
