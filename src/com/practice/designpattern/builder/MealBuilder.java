package com.practice.designpattern.builder;

public class MealBuilder {
    public Meal vegMealBuilder(){
        Meal vegMeal = new Meal();
        vegMeal.addItem(new VegBurger());
        vegMeal.addItem(new Coke());
        return vegMeal;
    }

    public Meal chickenMealBuilder(){
        Meal chickenMeal = new Meal();
        chickenMeal.addItem(new ChickenBurger());
        chickenMeal.addItem(new Pepsi());
        return chickenMeal;
    }


}
