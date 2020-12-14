package com.paytech.application;

import com.paytech.Person;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Deni", "Indonesia"),
                new Person("Dado", "Indonesia"),
                new Person("Arum", "Indonesia"),
        };


    Comparator<Person> comparator = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    Arrays.sort(people, comparator);
        System.out.println(Arrays.toString(people));
}
}
