package com.practice.random;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

enum Dept  {IT,
    Humanities,
    Medical,
    Commerce};

class Department {
 Dept dep;

 Department (Dept dep)
 {
     this.dep=dep;
 }
}

final  class  Student {

    public   int id;
    public final  String name;
    public final Department dept;
    Student (int id, String name, Department dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public String toString(){
        return id + "  " + name + " " + dept.dep;
    }

   /* public void setName(String name){
        this.name= name;
    }*/
}

public class FinalClassTest {

    public static void main(String [] args){
        Student  stud = new Student(10,"Aragon", new Department(Dept.IT));
        System.out.println(stud.toString());
        //stud.id = 50;
        //stud.setName("Legolas");
        stud.id=90;
        System.out.println(stud.toString());

        List list = new LinkedList();
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println(list);

    }

}
