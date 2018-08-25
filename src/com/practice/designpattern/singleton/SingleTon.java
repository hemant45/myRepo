package com.practice.designpattern.singleton;

public  class SingleTon {
    private Integer val;
    private static SingleTon obj = new SingleTon();

    public Integer getVal() {
        return val;
    }

    public void setVal(Integer val) {
        this.val = val;
    }

    private SingleTon(){};

    public static SingleTon getInstance (){
        return obj;
    }
}
