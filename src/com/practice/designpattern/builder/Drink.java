package com.practice.designpattern.builder;

public abstract class Drink implements Item{
    @Override
    public String name() {
        return "Drink";
    }

    @Override
    public abstract Integer cost();

    @Override
    public Packaging packing() {
        return new Bottle();
        }
    }
