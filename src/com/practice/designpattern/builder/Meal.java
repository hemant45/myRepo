package com.practice.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    List<Item> list = new ArrayList<Item>();

    public void addItem(Item it){
        list.add(it);
    }

    public Integer mealCost(){
        Integer totalCost = 0;
        for (Item it : list){
            totalCost +=it.cost();
        }
        return totalCost;
    }

    public void content(){
        System.out.println("Contents of meal : ");
        for(Item it : this.list){
            System.out.println(it.name());
        }
    }
}
