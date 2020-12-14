package com.paytech.application;

import com.paytech.Pair;

public class PairApp {
    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<String, Integer>("deni", 100);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
