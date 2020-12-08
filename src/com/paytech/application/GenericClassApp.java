package com.paytech.application;

import com.paytech.MyData;

public class GenericClassApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<String>("deni");
        MyData<Integer> IntegerMyData = new MyData<Integer>(20);

        String stringValue = stringMyData.getData();
        Integer IntegerValue = IntegerMyData.getData();

        System.out.println(stringValue);
        System.out.println(IntegerValue);

    }
}
