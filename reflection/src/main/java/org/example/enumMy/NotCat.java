package org.example.enumMy;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NotCat {

    public static void main(String[] args) throws Throwable {
        MagicCat magicCat = new MagicCat("Vaska");
        System.out.println(magicCat.getName());
        NotCat.lol(magicCat);
        System.out.println(magicCat.getName());


    }

    public static MagicCat lol(MagicCat magicCat) throws NoSuchFieldException, IllegalAccessException {
        Field name = magicCat.getClass().getDeclaredField("name");
        name.setAccessible(true);
        name.set(magicCat, "Xa-Xa-Xa");
        return magicCat;
    }
    public static void mem(MagicCat magicCat) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method getName = magicCat.getClass().getDeclaredMethod("getName");
        getName.invoke(true);

    }

}
