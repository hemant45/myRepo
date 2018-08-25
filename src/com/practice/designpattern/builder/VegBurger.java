package com.practice.designpattern.builder;

public class VegBurger extends Burger {
    @Override
    public String name(){
        return "Veg Burger";
    }

    @Override
    public  Integer cost(){
        return 50;
    }
}
