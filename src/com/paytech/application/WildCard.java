package com.paytech.application;

import com.paytech.MyData;

public class WildCard {
    public static void main(String[] args) {
        printLength(new MyData<Integer>(100));
        printLength(new MyData<String>("Deni"));
        printLength(new MyData<Boolean>(true));
        printLength(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));
    }
    public static void printLength(MyData<?> data){
        System.out.println(data.getData());
    }
}

