package com.practice.designpattern.builder;

public abstract class Burger implements Item{

    public abstract Integer cost();

    @Override
    public String name() {
        return "Burger";
    }

    @Override
    public Packaging packing(){
        return new Wrapper();
    }

}
