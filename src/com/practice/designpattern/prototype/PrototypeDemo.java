package com.practice.designpattern.prototype;

public class PrototypeDemo {

    public static void main(String [] args){

        Employees empList1 = new Employees();
        empList1.loadData();
        try{
            Employees empList2 = (Employees) empList1.clone();
            empList2.empList.add("NawazShareef");
            Employees empList3 = (Employees)empList2.clone();
            empList3.empList.remove("Rakesh");

            System.out.println("*********List one");
            empList1.displayEmployees();

            System.out.println("*********List Two");
            empList2.displayEmployees();

            System.out.println("*********List Three");
            empList3.displayEmployees();
        }
        catch(CloneNotSupportedException e){
            System.out.print(e);
        }


    }
}
