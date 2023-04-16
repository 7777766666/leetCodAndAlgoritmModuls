package org.example.re;

import java.lang.reflect.Field;

public abstract class Abstr {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {

        ABABABABA x111 = FF.create(111, "lol");
        ABABABABA x55 = FF.create(55, "Tiger");

        System.out.println(x111.getClass().getName());
        System.out.println(x55.getClass().getName());
        System.out.println(x111.x);
        System.out.println(x55.x);

        Field[] declaredFields = x55.getClass().getDeclaredFields();
        for (Field xxx : declaredFields){
//            System.out.println(xxx.getName());
            if (xxx.getName().equals("d")){
                xxx.setAccessible(true);
                xxx.set(x55, "SuperTiger");
                Field d = x55.getClass().getDeclaredField("d");
                d.setAccessible(true);
                Object o = d.get(x55);
                System.out.println((String)  o);

            }
        }




    }

}
