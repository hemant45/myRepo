package com.practice.random;

public class ArrayAssignment {
    int i[] = {0};
    int num =100;
    public static void main(String args[]) {
        int i[] = {1};
        int num =50;
         change_i(i);
         change_i(num);
        System.out.println(i[0]);
        System.out.println(num);
    }
    public static void change_i(int i[]) {
        int j[] = {2};
        i = j;
       // return j;
    }

    public static void change_i(int num) {
        int j = 200;
        num = j;
        //return num;
    }
}