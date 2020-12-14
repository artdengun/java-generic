package com.paytech.application;

public class BoundedTypeParameterApp {
    public static void main(String[] args) {
        NumberData<Integer> integerNumberData = new NumberData<>(100);
        NumberData<Long> longNumberData = new NumberData<>(11L);

        // error
//        NumberData<String> stringNumberData = new NumberData<String>("deni");

        System.out.println(integerNumberData);
    }

    public static  class NumberData<T extends  Number> {
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;

        }
    }
}
