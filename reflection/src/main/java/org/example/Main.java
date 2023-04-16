package org.example;

import org.example.myTest.Tiger;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException {


        Tiger tiger = new Tiger(250, "BigTiger");

        Field[] fieldsTiger = tiger.getClass().getDeclaredFields();
        Method[] methodsTiger = tiger.getClass().getDeclaredMethods();
        System.out.println(Arrays.toString(fieldsTiger));
        System.out.println(Arrays.toString(methodsTiger));
        for (Method xxx : methodsTiger){
            System.out.println(xxx.getName());
        }
        Field[] declaredFieldsTiger = tiger.getClass().getDeclaredFields();
        System.out.println(Arrays.toString(declaredFieldsTiger));
//        if (fieldsTiger.equals()   ){
//            System.out.println("!!!!!!!");
//        }


    }
}
