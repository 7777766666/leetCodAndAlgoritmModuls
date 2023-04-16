package org.example.enumMy;

import java.lang.reflect.Field;

public class Start {

    public static void main(String[] args) throws IllegalAccessException {

        Rofl rofl = new Rofl();
        System.out.println(rofl.getRofl());

        Field[] declaredFields = rofl.getClass().getDeclaredFields();

        for (Field xxx: declaredFields){
            System.out.println(xxx.getName());
            if (xxx.getName().equals("z")){
                xxx.setAccessible(true);
                xxx.set(rofl, 666);
            }
        }
        System.out.println(rofl.getRofl());
    }

}
