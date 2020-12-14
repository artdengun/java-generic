package com.paytech.application;

import com.paytech.util.ArrayHelper;

public class ArrayHelperApp {

    public static void main(String[] args) {
        String[] names = {"deni","gunawan"};
        Integer[] values = {1,2,3,4,5};

        System.out.println(ArrayHelper.<String> count(names));
        System.out.println(ArrayHelper.count(values));
    }

}
