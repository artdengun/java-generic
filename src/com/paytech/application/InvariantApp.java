package com.paytech.application;

import com.paytech.MyData;

public class InvariantApp {

    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Deni");
//        doIt(stringMyData); //ERROR
//        MyData<Object> objectMyData = stringMyData; //Error

        MyData<Object> objectMyData = new MyData<>(100);


       // doItInteger(objectMyData);
    }

    public static void doIt(MyData<Object> objectMyData){
        // do Nothing
    }

    public static void doItInteger(MyData<Integer> integerMyData){
        // do nothing
    }
}
