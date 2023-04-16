package org.example.re;

import java.lang.reflect.Field;

public class C {

    public B change(B b){

        Field[] declaredFields = b.getClass().getDeclaredFields();
        for (Field xxx : declaredFields){
            if (xxx.getName().equals("")){

            }
        }


        return null;

    }

    public B change2(int a, String b){
        return new B(a, b);
    }

}
