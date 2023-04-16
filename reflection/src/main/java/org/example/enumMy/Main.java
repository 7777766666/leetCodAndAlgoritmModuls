package org.example.enumMy;


import java.lang.reflect.Field;

public class Main {

    public enum Color {
        RED,
        GREEN,
        BLUE
    }

    public static void main(String[] args) throws Exception {
        Color color = Color.RED;

//        System.out.println(color.getClass().getName());
        Field[] declaredFields = color.getClass().getDeclaredFields();
        for (Field xxx : declaredFields){
            System.out.println(xxx.getName());
            if (xxx.getName().equals("RED")){
                xxx.setAccessible(true);
                xxx.set("RED",  "LOL");
            }
        }


//        Field field = color.getClass().getField("name");
//        field.setAccessible(true);
//        field.set(color, "YELLOW");
//        System.out.println(color);
    }


}

