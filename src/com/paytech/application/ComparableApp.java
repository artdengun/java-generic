package com.paytech.application;

import com.paytech.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
            Person[] people  = {
                    new Person("Deni", "Indonesia"),
                    new Person("Dado", "Indonesia"),
                    new Person("Arum", "Indonesia"),
            };
            Arrays.sort(people);
            System.out.println(Arrays.toString(people));
    }
}
