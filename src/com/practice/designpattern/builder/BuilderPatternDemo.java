package com.practice.designpattern.builder;

public class BuilderPatternDemo {

    public static void main(String [] args){
        MealBuilder mb = new MealBuilder();

        Meal vegMeal = mb.vegMealBuilder();
        Meal chickenMeal = mb.chickenMealBuilder();

        System.out.println("Veg meal contents and cost");
        vegMeal.content();
        System.out.print("Meal Cost : " + vegMeal.mealCost());

    }
}
