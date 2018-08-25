package com.practice.random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable{
    int id;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Age=" + Age +
                '}';
    }

    String name;
    int Age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        Age = age;
    }

    @Override
    public int compareTo (Object o){
         Employee emp= (Employee)o;
        int a = this.id - emp.id;
        return a;
    }


}

class NameCompare  implements Comparator<Employee>{
    @Override
    public int compare(Employee e1, Employee e2){
        return e1.name.compareTo(e2.name);
    }
}
public class ComparableComparator {


    public static  void main (String [] args){

        List<Employee> empList = new ArrayList <Employee>();
        empList.add(new Employee(5, "Frank", 28));
        empList.add(new Employee(1, "Jorge", 19));
        empList.add(new Employee(6, "Bill", 34));
        empList.add(new Employee(3, "Michel", 10));
        empList.add(new Employee(7, "Simpson", 8));
        empList.add(new Employee(4, "Clerk",16 ));
        empList.add(new Employee(8, "Lee", 40));
        empList.add(new Employee(2, "Mark", 30));
        Collections.sort(empList);

        for (Employee emp: empList) {
            System.out.println("Employee Details" +  emp.toString());
        }

        System.out.println("**************USING LAMBDA*****************");
        empList.forEach ((emp) -> System.out.println(emp.toString()));

        System.out.println ("***************Sortinmg by Name*************");
        empList.sort(new NameCompare());
        empList.forEach(
                (emp) -> System.out.println(emp.toString())
        );



    }



}
