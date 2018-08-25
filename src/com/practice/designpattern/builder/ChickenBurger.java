package com.practice.designpattern.builder;

public class ChickenBurger extends Burger {
    @Override
    public String name(){
        return "Chicken Burger";
    }

    @Override
    public  Integer cost(){
        return 40;
    }
}
