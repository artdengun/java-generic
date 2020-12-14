package com.paytech.application;

public class MultipleConstraintApp {
    public static void main(String[] args) {
        // ERROR manager tidak extendes CanSayHello
  //      Data<Manager> managerData = new Data<>(new Manager());
        Data<VicePresident> vicePresidentData = new Data<>(new VicePresident());
    }

    public static interface CanSayHello{
        void sayHello(String name);
    }

    public static abstract  class employee{

    }

    public static class Manager extends  employee{

    }

    public static  class  VicePresident extends employee implements CanSayHello{

        @Override
        public void sayHello(String name) {

        }
    }

    public static  class Data<T extends employee & CanSayHello>{
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
//            this.data.sayHello("deni"); error
        }
    }
}
