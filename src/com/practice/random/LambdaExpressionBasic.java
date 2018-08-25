package com.practice.random;


import java.util.HashMap;
import java.util.Map;

interface Drawing {
    public void draw();
}
interface Area {
    public Integer calcArea (Integer a, Integer b);
}
public class LambdaExpressionBasic {
    static int width = 10;
    static int length = 50;
    public static void main(String [] args){
        Drawing d = () -> {System.out.println("Width is : " + width);
        };
        d.draw();

        Area avg = (width , length) -> {
            int ar = width * length;
            return ar;
        };
        System.out.println("Area = " + avg.calcArea(50, 60));

        Area areaDouble = (a , b) -> {
            int arDb = a*b;
            arDb += arDb;
            return arDb;
        };
        System.out.println("Area = " + areaDouble.calcArea(50, 60));


        Map<String, String> person = new HashMap<String , String>();
        person. put("Arun","Teacher");
        person. put("Mithun","Student");
        person. put("Varun","Student");
        person. put("Tarun","Teacher");
        person. put("Tarun","Student");

            person.forEach(
                    (name,job) -> System.out.println("Name : " + name +":: Job : " + job)
            );


            System.out.println("Using Iterator");

         for(Map.Entry<String, String> per: person.entrySet()){
             System.out.println(per.getKey() + " " + per.getValue());
        };
    }
}
