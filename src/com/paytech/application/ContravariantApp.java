package com.paytech.application;

import com.paytech.MyData;

public class ContravariantApp {
    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>("deni");
        objectMyData.setData(1000);

        MyData<? super String> myData = objectMyData;

        process(objectMyData);
        System.out.println(objectMyData.getData());
    }

    public static  void process(MyData<? super String> myData){
//        String value = (String) myData.getData();
//        System.out.println("Process parameter " + value);

        Object value = myData.getData();
        System.out.println("procces parameter  " + value);

        myData.setData("Deni");
    }
}
