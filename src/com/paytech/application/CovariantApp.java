package com.paytech.application;

import com.paytech.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("deni");
        procces(stringMyData);
    }

    public static  void procces(MyData<? extends Object> myData){
        System.out.println(myData.getData());

//        myData.setData("DENI"); tidak boleh, karena berbahaya , data bisa rusak
    }
}
