package org.example.Vk;

public class Yy {






    public static void change(String s) {
        s = "world";
    }
    static String str = "Hello";


    public static void main(String[] args) {
        System.out.println(str);
        change(str);    //строки не изменяемы
        System.out.println(str);
    }
}
