package com.practice.designpattern.factory;

public class CarFactoryDemo {


    public static void main (String [] args) {
        CarFactory carfact = new CarFactory();
        String carName = "Swift";

        Cars myCar = carfact.getCar(carName);
    }

}
