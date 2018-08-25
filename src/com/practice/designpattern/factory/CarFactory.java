package com.practice.designpattern.factory;

public class CarFactory {

    public Cars getCar(String name){

        if(name==null){
            System.out.println("No Name Found");
            return null;
        } else if (name.equals("I20")){
            Cars car = new I20();
            car.createCar();
            return car;
        } else if (name.equals("Swift")){
            Cars car = new Swift();
            car.createCar();
            return car;
        }else {
            System.out.println("No car found with this name");
            return null;
        }

    }

}
