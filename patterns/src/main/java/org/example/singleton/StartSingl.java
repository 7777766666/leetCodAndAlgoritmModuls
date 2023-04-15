package org.example.singleton;

public class StartSingl {

    public static void main(String[] args) {



        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton);

        System.out.println(singleton.getSize());
        System.out.println(singleton1.getSize());
        singleton1.setSize(33);
        System.out.println(singleton1.getSize());
        System.out.println(singleton.getSize());

        System.out.println(singleton3.getSize() + " " + singleton2.getStr());
        singleton.setStr("Mem");
        System.out.println(singleton3.getSize() + " " + singleton2.getStr());
        singleton.setStr("lol");
        System.out.println(singleton3.getSize() + " " + singleton2.getStr());

    }
}
