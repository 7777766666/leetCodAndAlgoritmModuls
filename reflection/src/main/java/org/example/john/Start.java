package org.example.john;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Start {

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, NoSuchFieldException {

        Cat cat = new Cat("Tom", 10);
        Field[] catFields = cat.getClass().getDeclaredFields();
        for (Field xxx : catFields){
            System.out.println(xxx.getName());
            if (xxx.getName().equals("name")){
                xxx.setAccessible(true);
                xxx.set(cat, "newNameTom");
            }
        }
        System.out.println(cat.getName());
        System.out.println("_______________________________");

        Method[] catMethods = cat.getClass().getDeclaredMethods();
        for (Method xxx : catMethods){
            System.out.println(xxx.getName());
            if (xxx.getName().equals("mau")){
                // Change the implementation of the "mau" method
                Field field = xxx.getClass().getDeclaredField("artMethod");
                field.setAccessible(true);
                field.set(xxx, newMauMethod);
            }
        }
        cat.mau();



    }
    private static final long newMauMethod = 0; // Replace this with the bytecode of the new implementation
}
