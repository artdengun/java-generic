package com.paytech.application;

import com.paytech.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {
        MyData myData = new MyData("deni");

        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        Integer integer = integerMyData.getData();

    }
}
