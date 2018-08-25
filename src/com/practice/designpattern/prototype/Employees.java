package com.practice.designpattern.prototype;

import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    List<String> empList ;

    public void displayEmployees(){
        System.out.println("List of Employees");
        this.empList.forEach(
                (name) -> System.out.println("  " + name)
        );
    }
    public void loadData(){
        empList.add("Prakash");
        empList.add("Rakesh");
        empList.add("Ramesh");
        empList.add("Suresh");
    }
    public Employees(){
        empList = new ArrayList<String>();
    }

    public Employees(List<String> lst){
        this.empList = lst;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> tempList = new ArrayList<String>();
        for (String lt : this.empList){
            tempList.add(lt);
        }
        return new Employees(tempList);
    }
}
